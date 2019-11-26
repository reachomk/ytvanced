package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: abmi */
public final class abmi {
    public static String a(String str) {
        try {
            str = URLDecoder.decode(str, "UTF-8");
            return str;
        } catch (UnsupportedEncodingException e) {
            afpc.a(2, afpf.innertube, "Apparently UTF-8 is no longer a supported encoding", e);
            return str;
        }
    }

    public static anxl a(String str, anzq anzq) {
        try {
            return (anxl) anzq.a(Base64.decode(str, 8), anxa.c());
        } catch (IllegalArgumentException e) {
            afpf afpf = afpf.innertube;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
            stringBuilder.append("Unable to decode ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            afpc.a(2, afpf, stringBuilder.toString(), e);
            return null;
        } catch (anyg unused) {
            return null;
        }
    }

    public static aocf a(String str, aocf aocf) {
        afpf afpf;
        StringBuilder stringBuilder;
        amqw.a((Object) aocf);
        if (str != null) {
            str = abmi.a(str);
            try {
                aocf.mergeFrom(aocf, Base64.decode(str, 8));
                return aocf;
            } catch (IllegalArgumentException e) {
                afpf = afpf.innertube;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
                stringBuilder.append("Unable to decode ");
                stringBuilder.append(str);
                stringBuilder.append(".");
                afpc.a(2, afpf, stringBuilder.toString(), e);
            } catch (aocg e2) {
                afpf = afpf.innertube;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
                stringBuilder.append("Failed to turn ");
                stringBuilder.append(str);
                stringBuilder.append(" into a message.");
                afpc.a(2, afpf, stringBuilder.toString(), e2);
            }
        }
        return null;
    }

    public static anxl b(String str, anzq anzq) {
        amqw.a((Object) anzq);
        return str != null ? abmi.a(abmi.a(str), anzq) : null;
    }
}
