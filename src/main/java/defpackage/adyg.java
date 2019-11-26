package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.util.Set;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: adyg */
public final class adyg extends adyr {
    private static final String d = xtl.b("MDX.transport");
    public final Object a = new Object();
    public boolean b = false;
    private final bcaa e;
    private final adyl f;
    private final Object g = new Object();
    private boolean h = false;

    public adyg(adxz adxz, adyl adyl, adzb adzb, bcaa bcaa, acum acum) {
        super(adxz, adyl, adzb, acum);
        this.f = adyl;
        this.e = bcaa;
        adzb.a(new adyj(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final adxy b(adxy adxy) {
        return new adyi(this, adxy);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        adja adja = new adja();
        adja.a("ver", "1");
        a(adiv.MDX_REMOTE_STATUS, adja);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(adiv adiv) {
        if (adiv.a()) {
            return true;
        }
        boolean z;
        int i;
        synchronized (this.a) {
            z = this.b;
        }
        synchronized (this.g) {
            i = this.h & z;
        }
        if (i == 0 || !adiv.D.contains(adiv)) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(adxy adxy, adym adym) {
        if (adiv.LOUNGE_STATUS.equals(adym.a())) {
            for (adjd adjd : (Set) aebf.a(adym.b()).second) {
                if (adjd.b().equals(this.e.get())) {
                    break;
                }
            }
            adjd adjd2 = null;
            if (adjd2 != null) {
                String c = adjd2.c();
                String.format("Extracting encryption key from lounge status: %s", new Object[]{c});
                try {
                    synchronized (this.g) {
                        adyl adyl = this.f;
                        if (!(adyl.a || TextUtils.isEmpty(c))) {
                            synchronized (adyl.b) {
                                adyl.e = new SecretKeySpec(Base64.decode(c, 8), "AES");
                                adyl.d.init(1, adyl.e);
                                adyl.c = true;
                            }
                        }
                        this.h = true;
                    }
                } catch (InvalidKeyException unused) {
                    xtl.a(d, "Invalid key, could not initialize encryption.");
                }
            } else {
                xtl.a(d, "Could not identify remote in session member list.  Cannot extract encryption key.");
            }
        }
        adxy.a(adym);
    }
}
