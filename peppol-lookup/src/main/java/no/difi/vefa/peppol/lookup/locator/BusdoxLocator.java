package no.difi.vefa.peppol.lookup.locator;

import no.difi.vefa.peppol.common.model.ParticipantIdentifier;
import no.difi.vefa.peppol.lookup.api.LookupException;
import no.difi.vefa.peppol.lookup.util.DynamicHostnameGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.TextParseException;

import java.net.URI;

public class BusdoxLocator extends AbstractLocator {

    private static Logger logger = LoggerFactory.getLogger(BusdoxLocator.class);

    private DynamicHostnameGenerator hostnameGenerator;

    public BusdoxLocator(String hostname) {
        hostnameGenerator = new DynamicHostnameGenerator("B-", hostname, "MD5");
    }

    @Override
    public URI lookup(ParticipantIdentifier participantIdentifier) throws LookupException {
        // Create hostname for participant identifier.
        String hostname = hostnameGenerator.generate(participantIdentifier);

        logger.debug(hostname);

        try {
            if (new Lookup(hostname).run() == null)
                throw new LookupException(String.format("Identifier '%s' not registered in SML.", participantIdentifier.toString()));
        } catch (TextParseException e) {
            throw new LookupException(e.getMessage(), e);
        }

        return URI.create(String.format("http://%s", hostname));
    }
}
