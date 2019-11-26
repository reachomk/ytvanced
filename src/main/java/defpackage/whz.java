package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: whz */
public final class whz implements akot, OnLayoutChangeListener {
    private final wlg a;
    private final akkq b;
    private final DisplayMetrics c;
    private final View d;
    private final FixedAspectRatioRelativeLayout e = ((FixedAspectRatioRelativeLayout) this.d.findViewById(R.id.image_layout));
    private final ImageView f = ((ImageView) this.d.findViewById(R.id.image_view));
    private final boolean g;
    private final ImageView h = ((ImageView) this.d.findViewById(R.id.backstage_image_badge));
    private apbf i;
    private boolean j;

    public whz(Context context, akkq akkq, afnw afnw, zyw zyw, Executor executor) {
        this.b = (akkq) amqw.a((Object) akkq);
        amqw.a((Object) context);
        this.c = context.getResources().getDisplayMetrics();
        this.d = View.inflate(context, R.layout.backstage_image, null);
        boolean a = whz.a(zyw);
        this.g = a;
        if (a) {
            this.a = new wlg(akkq, afnw, this.f, executor);
        } else {
            this.a = null;
        }
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        if (this.g) {
            this.a.a();
            this.f.removeOnLayoutChangeListener(this);
        } else {
            this.b.a(this.f);
        }
        this.i = null;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        b();
    }

    private final void b() {
        if (this.i != null && this.f.getWidth() != 0) {
            wlg wlg = this.a;
            aygk aygk = this.i.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            boolean z = this.j;
            int width = wlg.a.getWidth();
            if (!(width == 0 || aygk == null)) {
                wlg.b = z;
                wlg.a(aklb.b(aygk, width));
            }
            this.f.removeOnLayoutChangeListener(this);
        }
    }

    public static boolean a(zyw zyw) {
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.b & 67108864) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                aorf aorf = auya2.I;
                if (aorf == null) {
                    aorf = aorf.c;
                }
                return aorf.b;
            }
        }
        return true;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apbf apbf = (apbf) obj;
        aygk aygk = apbf.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        if (aklb.a(aygk)) {
            this.j = false;
            if (akor.a("postsV2FullThumbnailStyle", false)) {
                this.j = true;
            }
            akor.a.a(apbf.d.d(), null);
            this.i = apbf;
            this.h.setVisibility(8);
            if (this.j) {
                this.h.setVisibility(0);
            }
            aygk aygk2 = apbf.b;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            aygm f = aklb.f(aygk2);
            int i = f.c;
            if (i > 0) {
                int i2 = f.d;
                if (i2 > 0) {
                    FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = this.e;
                    fixedAspectRatioRelativeLayout.a = ((float) i) / ((float) i2);
                    fixedAspectRatioRelativeLayout.a(xss.a(this.c, i));
                    this.e.b(xss.a(this.c, f.d));
                    if (this.g) {
                        this.f.addOnLayoutChangeListener(this);
                        b();
                        return;
                    }
                    akkq akkq = this.b;
                    ImageView imageView = this.f;
                    aygk aygk3 = apbf.b;
                    if (aygk3 == null) {
                        aygk3 = aygk.f;
                    }
                    akkq.a(imageView, aygk3);
                    return;
                }
            }
            FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout2 = this.e;
            fixedAspectRatioRelativeLayout2.a = 1.0f;
            fixedAspectRatioRelativeLayout2.a(Integer.MAX_VALUE);
            this.e.b(Integer.MAX_VALUE);
            if (this.g) {
                this.a.a();
            } else {
                this.b.a(this.f);
            }
        }
    }
}
