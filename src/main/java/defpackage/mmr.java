package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;

/* renamed from: mmr */
public final class mmr implements aamt {
    private final String a;
    private final String b;
    private final String c;

    public mmr(Context context, String str, String str2) {
        this.a = xvd.a(str);
        this.b = xvd.a(str2);
        try {
            PackageInfo a = xul.a(context, 64);
            if (a.signatures.length == 1) {
                this.c = Base64.encodeToString(xvw.b(a.signatures[0].toByteArray()), 10);
            } else {
                Signature[] signatureArr = a.signatures;
                throw new xuo();
            }
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Couldn't get package information.", e);
        }
    }

    public final void a(asib asib) {
        asii a = a();
        asib.copyOnWrite();
        ashy ashy = (ashy) asib.instance;
        if (a != null) {
            ashy.i = a;
            ashy.a |= 128;
            return;
        }
        throw new NullPointerException();
    }

    public final asii a() {
        asil asil = (asil) asii.e.createBuilder();
        String str = this.b;
        asil.copyOnWrite();
        asii asii = (asii) asil.instance;
        if (str != null) {
            asii.a |= 2;
            asii.c = str;
            str = this.c;
            asil.copyOnWrite();
            asii = (asii) asil.instance;
            if (str != null) {
                asii.a |= 4;
                asii.d = str;
                str = this.a;
                asil.copyOnWrite();
                asii = (asii) asil.instance;
                if (str != null) {
                    asii.a |= 1;
                    asii.b = str;
                    return (asii) ((anxl) asil.build());
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
