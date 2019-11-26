package defpackage;

import android.text.TextUtils;

/* renamed from: ylf */
public abstract class ylf extends yki {
    public ylf(String str, apsk apsk, boolean z, boolean z2) {
        super(str, apsk, z, z2);
    }

    public abstract void a(asfd asfd);

    public abstract yli f();

    public abstract String getAuthorKey();

    public String getDeleteToken() {
        return null;
    }

    public amul getEmotions() {
        return null;
    }

    public String getHeartToken() {
        return null;
    }

    public abstract String getTemporaryClientId();

    public String getUnheartToken() {
        return null;
    }

    public final boolean a(String str) {
        return TextUtils.equals(str, getAuthorKey());
    }

    public amul getHeartedContactEntityKeys() {
        amuo j = amul.j();
        amul<apru> emotions = getEmotions();
        if (emotions != null) {
            for (apru apru : emotions) {
                apry apry;
                if (apru.a == 1) {
                    apry = (apry) apru.b;
                } else {
                    apry = apry.c;
                }
                if ((apry.a & 1) != 0) {
                    apry apry2;
                    if (apru.a == 1) {
                        apry2 = (apry) apru.b;
                    } else {
                        apry2 = apry.c;
                    }
                    j.c(apry2.b);
                }
            }
        }
        return j.a();
    }

    public final boolean b(String str) {
        return getHeartedContactEntityKeys().contains(str);
    }
}
