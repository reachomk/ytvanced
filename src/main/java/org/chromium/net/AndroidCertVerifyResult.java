package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AndroidCertVerifyResult {
    private final int a;
    private final boolean b;
    private final List c;

    public AndroidCertVerifyResult(boolean z, List list) {
        this.a = 0;
        this.b = z;
        this.c = new ArrayList(list);
    }

    public AndroidCertVerifyResult(int i) {
        this.a = i;
        this.b = false;
        this.c = Collections.emptyList();
    }

    public int getStatus() {
        return this.a;
    }

    public boolean isIssuedByKnownRoot() {
        return this.b;
    }

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.c.size()][];
        int i = 0;
        while (i < this.c.size()) {
            try {
                bArr[i] = ((X509Certificate) this.c.get(i)).getEncoded();
                i++;
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }
}
