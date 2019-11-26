package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: wac */
public final class wac extends wag {
    public aitp a;
    public wae f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final Context j;
    private final int k = R.string.ad_learn_more;

    public wac(Context context) {
        super(vyc.d().a());
        this.j = (Context) amqw.a((Object) context);
    }

    public static boolean a(boolean z, boolean z2, boolean z3) {
        return (!z || z2 || z3) ? false : true;
    }

    public final /* synthetic */ void a(Object obj, boolean z) {
        aitp aitp;
        vyc vyc = (vyc) obj;
        CharSequence c = vyc.c();
        boolean b = vyc.b();
        this.i = vyc.a();
        int i = 8;
        if (!(((vyc) this.b).c().equals(c) && ((vyc) this.b).b() == b)) {
            if (b) {
                if ("<NONE>".equals(c)) {
                    c = this.j.getResources().getString(this.k);
                }
                aitp = this.a;
                if (aitp != null) {
                    aitp.a(c);
                }
            } else {
                aitp = this.a;
                if (aitp != null) {
                    aitp.a(8);
                }
            }
        }
        aitp = this.a;
        if (aitp != null) {
            if (z && wac.a(b, this.i, this.g)) {
                i = 0;
            }
            aitp.a(i);
        }
    }
}
