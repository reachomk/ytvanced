package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: aihx */
public final class aihx implements aihy, ajan, xcp {
    private final Resources a;
    private final aizy b;
    private final aihv c;

    public aihx(Resources resources, aizy aizy, aihv aihv) {
        this.a = (Resources) amqw.a((Object) resources);
        this.b = aizy;
        this.c = (aihv) amqw.a((Object) aihv);
        aihv.a(this);
    }

    public final long e() {
        return 4194304;
    }

    public final void a(int i) {
        String E;
        aizy aizy = this.b;
        if (aizy.D() != null) {
            E = aizy.D().E();
        } else {
            E = afgs.c;
        }
        aizy.e.a(i, i, aizy.b.d(), E);
        if (aizy.D() != null) {
            aizy.D().c(i);
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().e.a(ajcg.b(ajam.O(), 4194304)).a(ajcg.a(ajam.O(), 4194304, 0)).a(new aiia(this), aihz.a)};
    }

    public final void a(aetv aetv) {
        if (aetv.b != null) {
            this.c.g(aetv.a());
            if (aetv.a()) {
                aajq[] aajqArr = aetv.e;
                int length = aajqArr.length;
                aajq[] aajqArr2 = new aajq[(length + 1)];
                aajqArr2[0] = new aajq(this.a.getString(R.string.quality_auto));
                boolean z = true;
                System.arraycopy(aajqArr, 0, aajqArr2, 1, length);
                aahr aahr = aetv.b;
                length = -1;
                int u = aahr != null ? aahr.u() : -1;
                for (int i = 0; i < aajqArr2.length; i++) {
                    if (aajqArr2[i].a == u) {
                        length = i;
                        break;
                    }
                }
                afgq afgq = aetv.g;
                if (afgq != null && afgq.a()) {
                    z = false;
                }
                this.c.a(aajqArr2, length, z);
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class};
        } else if (i == 0) {
            a((aetv) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
