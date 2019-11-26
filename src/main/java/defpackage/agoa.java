package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* renamed from: agoa */
public final class agoa {
    public final aaxf a;
    public final agmk b;
    public final agnv c;
    private final Context d;
    private final acum e;

    public agoa(Context context, aaxf aaxf, agmk agmk, acum acum, agnv agnv) {
        this.d = context;
        this.a = aaxf;
        this.b = agmk;
        this.e = acum;
        this.c = agnv;
    }

    public static boolean a(agql agql) {
        return (agql.o() == null || !agmn.a(agql.p()) || agql.j() == null || agql.i() == null || agql.l() != 1) ? false : true;
    }

    public final void a(aghl aghl, agqn agqn, String str) {
        Uri uri = agqn.e;
        if (uri != null) {
            try {
                agmn.a(this.d, uri);
            } catch (SecurityException unused) {
                xtl.c("Failed to delete YTB file when resetting YTB transfer.");
            }
            try {
                this.b.a(str, uri).b();
            } catch (IOException unused2) {
                xtl.c("Failed to delete YTB progress when resetting YTB transfer.");
            }
        }
        agql agql = agqn.a;
        if (agql != null) {
            agoa.a(aghl, agql);
        }
        agql agql2 = agqn.b;
        if (agql2 != null) {
            agoa.a(aghl, agql2);
        }
    }

    private static void a(aghl aghl, agql agql) {
        agql = agql.y().a(null).c(1).a(null).a(null).b(null).b(0).a(0).a();
        amqw.b(agoa.a(agql) ^ 1);
        aghl.b(agql);
    }

    public final agyc a(agqz agqz, String str, amqp amqp, int i, boolean z) {
        a(agqz, i, z);
        return agyc.a(str, (Exception) amqp.c(), agqf.FAILED_UNKNOWN, 32);
    }

    public final void a(agqz agqz, int i, boolean z) {
        azri azri = (azri) azrj.e.createBuilder();
        azri.copyOnWrite();
        azrj azrj = (azrj) azri.instance;
        if (i != 0) {
            azrj.a |= 1;
            azrj.b = i - 1;
            azri.copyOnWrite();
            azrj azrj2 = (azrj) azri.instance;
            azrj2.a |= 2;
            azrj2.c = z;
            String l = agxj.l(agqz.f);
            if (l != null) {
                azri.copyOnWrite();
                azrj2 = (azrj) azri.instance;
                azrj2.a |= 4;
                azrj2.d = l;
            }
            acum acum = this.e;
            asmz asmz = (asmz) asmw.f.createBuilder();
            azrj azrj3 = (azrj) ((anxl) azri.build());
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (azrj3 != null) {
                asmw.c = azrj3;
                asmw.b = 280;
                acum.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
