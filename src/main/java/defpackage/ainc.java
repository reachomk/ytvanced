package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.net.Uri;

/* renamed from: ainc */
final /* synthetic */ class ainc implements Runnable {
    private final aimu a;
    private final aini b;
    private final int c;

    ainc(aimu aimu, aini aini, int i) {
        this.a = aimu;
        this.b = aini;
        this.c = i;
    }

    public final void run() {
        aimu aimu = this.a;
        aini aini = this.b;
        int i = this.c;
        long j = (long) i;
        Long valueOf = Long.valueOf(aimu.a(aini, j));
        synchronized (aimu.j) {
            if (!(valueOf.longValue() == aimu.f || valueOf.longValue() == aimu.d)) {
                Uri b = aimu.b(aini, i);
                Bitmap bitmap = null;
                if ((b != null ? (BitmapRegionDecoder) aimu.c.get(b) : null) == null) {
                    aimu.a(aini, i);
                } else {
                    j = aimu.a(aini, j);
                    Bitmap bitmap2 = aimu.e;
                    if (bitmap2 != null) {
                        amqw.a(bitmap2 != aimu.g);
                    }
                    bitmap2 = aimu.e;
                    BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder) aimu.c.get(aimu.b(aini, i));
                    if (bitmapRegionDecoder == null) {
                        aimu.a(aini, i);
                    } else {
                        Options options = new Options();
                        options.inBitmap = bitmap2;
                        options.inMutable = true;
                        try {
                            int c = i % aini.c();
                            int i2 = aini.c;
                            c /= i2;
                            i %= i2;
                            i2 = aini.a;
                            i *= i2;
                            int i3 = aini.b;
                            c *= i3;
                            Rect rect = new Rect(i, c, (i2 + i) - 1, (i3 + c) - 1);
                            i3 = aimu.m;
                            if (i3 == 1) {
                                rect.set(rect.left, rect.top, rect.centerX(), rect.bottom);
                            } else if (i3 == 3) {
                                rect.set(rect.left, rect.top, rect.right, rect.centerY());
                            }
                            if (bitmapRegionDecoder.getWidth() >= rect.right && bitmapRegionDecoder.getHeight() >= rect.bottom && rect.width() > 0 && rect.height() > 0) {
                                bitmap = bitmapRegionDecoder.decodeRegion(rect, options);
                            }
                        } catch (Exception e) {
                            afpf afpf = afpf.player;
                            String str = "Storyboard regionDecoder.decodeRegion exception - ";
                            String name = e.getClass().getName();
                            if (name.length() == 0) {
                                name = new String(str);
                            } else {
                                name = str.concat(name);
                            }
                            afpc.a(2, afpf, name);
                            aimu.k = true;
                        }
                    }
                    if (bitmap != null) {
                        aimu.e = aimu.g;
                        aimu.d = aimu.f;
                        aimu.g = bitmap;
                        aimu.f = j;
                        aimu.a(aimu.g);
                    }
                }
            }
            aimu.l = false;
        }
    }
}
