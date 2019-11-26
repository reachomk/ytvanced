package defpackage;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* renamed from: bnw */
public final class bnw extends bnr {
    private final Paint g = new bkq(3);
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private blj j;

    bnw(bju bju, bnv bnv) {
        super(bju, bnv);
    }

    public final void b(Canvas canvas, Matrix matrix, int i) {
        Bitmap c = c();
        if (c != null && !c.isRecycled()) {
            float a = bpg.a();
            this.g.setAlpha(i);
            blj blj = this.j;
            if (blj != null) {
                this.g.setColorFilter((ColorFilter) blj.f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.h.set(0, 0, c.getWidth(), c.getHeight());
            this.i.set(0, 0, (int) (((float) c.getWidth()) * a), (int) (((float) c.getHeight()) * a));
            canvas.drawBitmap(c, this.h, this.i, this.g);
            canvas.restore();
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        Bitmap c = c();
        if (c != null) {
            rectF.set(0.0f, 0.0f, ((float) c.getWidth()) * bpg.a(), ((float) c.getHeight()) * bpg.a());
            this.a.mapRect(rectF);
        }
    }

    private final Bitmap c() {
        bmb bmb;
        String str = this.c.f;
        bju bju = this.b;
        if (bju.getCallback() != null) {
            bmb bmb2 = bju.f;
            if (bmb2 != null) {
                Callback callback = bju.getCallback();
                Object context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!((context == null && bmb2.a == null) || bmb2.a.equals(context))) {
                    bju.f = null;
                }
            }
            if (bju.f == null) {
                bju.f = new bmb(bju.getCallback(), bju.g, bju.a.c);
            }
            bmb = bju.f;
        } else {
            bmb = null;
        }
        if (bmb == null) {
            return null;
        }
        bkc bkc = (bkc) bmb.d.get(str);
        if (bkc == null) {
            return null;
        }
        Bitmap bitmap = bkc.c;
        if (bitmap != null) {
            return bitmap;
        }
        bje bje = bmb.c;
        String str2 = bkc.b;
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(bmb.b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = bmb.a.getAssets();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(bmb.b);
                stringBuilder.append(str2);
                return bmb.a(str, BitmapFactory.decodeStream(assets.open(stringBuilder.toString()), null, options));
            } catch (IOException e) {
                bpb.a("Unable to open asset.", e);
                return null;
            }
        }
        try {
            byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
            return bmb.a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e2) {
            bpb.a("data URL did not have correct base64 format.", e2);
            return null;
        }
    }

    public final void a(Object obj, bph bph) {
        super.a(obj, bph);
        if (obj != bkg.B) {
            return;
        }
        if (bph != null) {
            this.j = new blz(bph);
        } else {
            this.j = null;
        }
    }
}
