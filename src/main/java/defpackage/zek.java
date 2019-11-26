package defpackage;

import android.net.Uri;
import android.text.Spanned;

/* renamed from: zek */
public final class zek {
    public final aapn a;

    public zek(aapn aapn) {
        this.a = (aapn) amqw.a((Object) aapn);
    }

    public static zet a(aoyi aoyi) {
        arml arml;
        arml arml2;
        aygk aygk;
        arml arml3 = null;
        if ((aoyi.a & 1) != 0) {
            arml = aoyi.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if ((aoyi.a & 2) != 0) {
            arml = aoyi.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a2 = ajqy.a(arml);
        int i = aoyi.d;
        ayvl ayvl = aoyi.f;
        if (ayvl == null) {
            ayvl = ayvl.d;
        }
        if ((ayvl.a & 1) == 0) {
            arml2 = null;
        } else {
            ayvl = aoyi.f;
            if (ayvl == null) {
                ayvl = ayvl.d;
            }
            arml2 = Uri.parse(ayvl.b);
        }
        if ((aoyi.a & 8) != 0) {
            aygk aygk2 = aoyi.e;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            aygk = aygk2;
        } else {
            aygk = null;
        }
        if ((aoyi.a & 32) != 0) {
            arml = aoyi.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a3 = ajqy.a(arml);
        if ((aoyi.a & 64) != 0) {
            arml3 = aoyi.h;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        return new zet(a, a2, i, arml2, aygk, a3, ajqy.a(arml3));
    }
}
