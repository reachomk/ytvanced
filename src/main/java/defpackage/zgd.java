package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.google.android.youtube.R;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Set;

/* renamed from: zgd */
public final class zgd extends Drawable implements ujk, zgh {
    public int a;
    public final Paint b = new Paint();
    private final zgf c;
    private final ujf d;
    private final uja e;
    private final Paint f;
    private final Handler g;

    public zgd(zgf zgf, ujf ujf, uja uja, Resources resources) {
        this.c = (zgf) amqw.a((Object) zgf);
        this.d = (ujf) amqw.a((Object) ujf);
        ujf.a((ujk) this);
        this.e = (uja) amqw.a((Object) uja);
        this.b.setColor(resources.getColor(R.color.video_trim_view_waveform_background));
        this.b.setStyle(Style.FILL);
        this.f = new Paint(1);
        this.f.setColor(resources.getColor(R.color.video_trim_view_waveform_fill));
        this.f.setStyle(Style.FILL);
        this.g = new Handler(Looper.getMainLooper());
        zgf.f = this;
    }

    public final void a(ujf ujf, Set set) {
    }

    public final void b(ujf ujf, Set set) {
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        canvas2.drawRect(bounds, this.b);
        if (this.c.c() > 0) {
            int width = bounds.width();
            int i = this.a;
            float f = ((float) i) / ((float) (width - (i + i)));
            long b = this.e.b(-f);
            long b2 = this.e.b(f + 1.0f);
            ShortBuffer asShortBuffer = ByteBuffer.wrap(this.c.d.toByteArray()).asShortBuffer();
            long b3 = this.c.b();
            int j = (int) ((this.d.j() + this.d.u()) / b3);
            int i2 = ((int) (b / b3)) - j;
            int i3 = (((int) (b2 / b3)) - j) + 1;
            Rect rect = new Rect(bounds.left + this.a, bounds.top, bounds.right - this.a, bounds.bottom);
            Path path = new Path();
            uja uja = this.e;
            int max = Math.max(i2, 0);
            int min = Math.min(i3, asShortBuffer.limit());
            float f2 = ((float) bounds.left) - 2.0f;
            float f3 = (float) ((b2 - b) / ((long) (i3 - i2)));
            int i4 = max;
            float f4 = 0.0f;
            while (i4 < min) {
                f4 = Math.max(f4, ((float) asShortBuffer.get(i4)) / 32767.0f);
                float f5 = f3;
                float a = ((float) rect.left) + (uja.a(((long) (((float) (i4 - i2)) * f3)) + b) * ((float) rect.width()));
                if (i4 == max) {
                    path.moveTo(a, (float) rect.centerY());
                }
                if (a >= 2.0f + f2) {
                    path.lineTo(a, ((float) rect.centerY()) + ((f4 * ((float) rect.height())) * 0.5f));
                    f2 = a;
                    f4 = 0.0f;
                }
                if (i4 == min - 1) {
                    path.lineTo(a, (float) rect.centerY());
                }
                i4++;
                f3 = f5;
            }
            Matrix matrix = new Matrix();
            matrix.preScale(1.0f, -1.0f, 0.0f, (float) bounds.centerY());
            path.addPath(path, matrix);
            canvas.save();
            Canvas canvas3 = canvas;
            canvas3.clipRect(bounds);
            canvas3.drawPath(path, this.f);
            canvas.restore();
            return;
        }
    }

    public final void a() {
        b();
    }

    private final void b() {
        this.g.post(new zgg(this));
    }

    public final void a(ujf ujf, ujh ujh) {
        int ordinal = ujh.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            b();
        }
    }
}
