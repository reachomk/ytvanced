package defpackage;

import com.google.android.youtube.R;

/* renamed from: kiu */
final /* synthetic */ class kiu implements Runnable {
    private final kis a;
    private final String b;
    private final boolean c;

    kiu(kis kis, String str, boolean z) {
        this.a = kis;
        this.b = str;
        this.c = z;
    }

    public final void run() {
        kis kis = this.a;
        String str = this.b;
        boolean z = this.c;
        kis.a.b(str);
        kis.a.b();
        if (z) {
            xpr.a(kis.a.a, (int) R.string.delete_reel_upload_done, 1);
        }
    }
}
