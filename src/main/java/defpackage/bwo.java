package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bwo */
public final class bwo implements bwd {
    private static final Config a = Config.ARGB_8888;
    private final bwq b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public bwo(long j) {
        bws bws = new bws();
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        hashSet.add(null);
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = bws;
        this.c = unmodifiableSet;
        bwn bwn = new bwn();
    }

    public final synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Cannot pool recycled bitmap");
                }
                if (bitmap.isMutable() && ((long) this.b.b(bitmap)) <= this.d) {
                    if (this.c.contains(bitmap.getConfig())) {
                        int b = this.b.b(bitmap);
                        this.b.a(bitmap);
                        this.h++;
                        this.e += (long) b;
                        a(this.d);
                        return;
                    }
                }
                bitmap.recycle();
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final Bitmap a(int i, int i2, Config config) {
        Bitmap d = d(i, i2, config);
        if (d == null) {
            return bwo.c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    public final Bitmap b(int i, int i2, Config config) {
        Bitmap d = d(i, i2, config);
        return d == null ? bwo.c(i, i2, config) : d;
    }

    private static Bitmap c(int i, int i2, Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized Bitmap d(int i, int i2, Config config) {
        if (VERSION.SDK_INT >= 26) {
            if (config == Config.HARDWARE) {
                String valueOf = String.valueOf(config);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 176);
                stringBuilder.append("Cannot create a mutable Bitmap with config: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        bwq bwq = this.b;
        if (config == null) {
            config = a;
        }
        Bitmap a = bwq.a(i, i2, config);
        if (a == null) {
            this.g++;
            return null;
        }
        this.f++;
        this.e -= (long) this.b.b(a);
        a.setHasAlpha(true);
        a.setPremultiplied(true);
        return a;
    }

    public final void a() {
        a(0);
    }

    public final void a(int i) {
        if (i < 40) {
            if (i >= 20 || i == 15) {
                a(this.d / 2);
            }
            return;
        }
        a();
    }

    private final synchronized void a(long j) {
        while (this.e > j) {
            Bitmap a = this.b.a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    String.valueOf(this.b).length();
                }
                this.e = 0;
                return;
            }
            this.e -= (long) this.b.b(a);
            this.i++;
            a.recycle();
        }
    }
}
