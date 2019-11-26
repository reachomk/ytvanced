package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: fyy */
public final class fyy implements akot {
    public final Context a;
    public final Executor b;
    public final File c = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
    public fyo d;
    public Bitmap e;
    public anjv f;
    private final ImageButton g = ((ImageButton) this.m.findViewById(R.id.back_button));
    private final ImageButton h = ((ImageButton) this.m.findViewById(R.id.save_button));
    private final ImageButton i = ((ImageButton) this.m.findViewById(R.id.share_button));
    private final FrameLayout j = ((FrameLayout) this.m.findViewById(R.id.screenshot_container));
    private final RelativeLayout k = ((RelativeLayout) this.m.findViewById(R.id.scrim));
    private final ImageView l = ((ImageView) this.m.findViewById(R.id.screenshot));
    private final View m;
    private Bitmap n;

    public fyy(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
        this.m = View.inflate(context, R.layout.image_capture_layout, null);
    }

    public final View K_() {
        return this.m;
    }

    public final anjv a(File file) {
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            bitmap = this.n;
        }
        return anjf.a(new fzg(file, bitmap), this.b);
    }

    public final void b() {
        anjv anjv = this.f;
        if (anjv != null && !anjv.isDone()) {
            this.f.cancel(true);
            this.f = null;
        }
    }

    public final void c() {
        if (this.e == null) {
            this.k.setVisibility(8);
            this.j.setDrawingCacheEnabled(true);
            this.e = Bitmap.createBitmap(this.j.getDrawingCache());
            this.j.setDrawingCacheEnabled(false);
            this.k.setVisibility(0);
        }
    }

    public final void a(akpb akpb) {
        b();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        fyp fyp = (fyp) obj;
        this.d = (fyo) akor.a("sectionController");
        this.n = fyp.a;
        this.l.setImageBitmap(this.n);
        this.g.setOnClickListener(new fyx(this));
        this.h.setOnClickListener(new fza(this));
        this.i.setOnClickListener(new fyz(this));
    }

    static final /* synthetic */ void b(Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("Failed to save screenshot: ");
        stringBuilder.append(valueOf);
        xtl.c(stringBuilder.toString());
    }
}
