package defpackage;

import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;

/* renamed from: uzj */
public final class uzj {
    public static apxu a(apxu apxu) {
        if (apxu == null) {
            return null;
        }
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.a();
        apxx.copyOnWrite();
        ((apxu) apxx.instance).c = anxl.emptyProtobufList();
        apxx.c(axft.b);
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.copyOnWrite();
        avjf avjf = (avjf) avjh.instance;
        avjf.a |= 512;
        avjf.f = true;
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu b(apxu apxu) {
        axng axng;
        apxu apxu2 = null;
        if (apxu != null) {
            Object obj;
            anxr access$000 = anxl.checkIsLite(SignInEndpointOuterClass.signInEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            axng = (axng) obj;
        } else {
            axng = null;
        }
        if (!(axng == null || (axng.a & 2) == 0)) {
            apxu2 = axng.b;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
        }
        apxu2 = uzj.a(apxu2);
        if (axng == null || apxu2 == null) {
            return apxu;
        }
        axni axni = (axni) axng.c.createBuilder(axng);
        axni.copyOnWrite();
        axng = (axng) axni.instance;
        axng.b = apxu2;
        axng.a |= 2;
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(SignInEndpointOuterClass.signInEndpoint, (axng) ((anxl) axni.build()));
        return (apxu) ((anxl) apxx.build());
    }
}
