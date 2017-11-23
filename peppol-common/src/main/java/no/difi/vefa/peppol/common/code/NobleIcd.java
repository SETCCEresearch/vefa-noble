package no.difi.vefa.peppol.common.code;

import no.difi.vefa.peppol.common.api.Icd;
import no.difi.vefa.peppol.common.model.Scheme;

/**
 * Created by zelicj on 26/06/2017.
 */
public class NobleIcd  implements Icd {
    private String identifier;
    private String code;
    private Scheme scheme;

    public NobleIcd(String identifier, String code, Scheme scheme) {
        super();
        this.identifier = identifier;
        this.code = code;
        this.scheme = scheme;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getCode() {
        return code;
    }

    public Scheme getScheme() {
        return scheme;
    }

    public boolean isDeprecated() {
        return false;
    }

}
