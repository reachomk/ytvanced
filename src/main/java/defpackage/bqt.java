package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;
import android.text.format.Formatter;
import com.google.android.libraries.youtube.rendering.image.glide.GlideLoaderModule;
import com.google.android.youtube.R;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Set;

/* renamed from: bqt */
final class bqt extends bqu {
    private final GlideLoaderModule a = new GlideLoaderModule();

    bqt() {
    }

    public final boolean a() {
        return false;
    }

    public final void a(Context context, bra bra) {
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        akmu akmu = glideLoaderModule.a;
        if (cgt.b != null || cgt.a) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        int i;
        cgt.b = Integer.valueOf(R.id.image_view_controller_tag);
        cgg cgg = new cgg();
        if (!xvw.a(context)) {
            cgg.i();
        }
        aort aort = akmu.c;
        if (aort.j) {
            i = aort.k;
            bra.h = new bxf(context, "image_manager_disk_cache", (long) (i > 0 ? i * 1048576 : 262144000));
        } else if (aort.l) {
            cgg.a(bup.a);
            bra.h = new bxa();
        } else {
            cgg.a(bup.a);
            bra.h = new bxa();
        }
        bra.l = (bqx) chw.a(new brc(cgg));
        bxl bxl = new bxl(context);
        float f = akmu.c.c;
        boolean z = false;
        if (f > 0.0f && f <= 1.0f) {
            boolean z2 = f >= 0.0f && f <= 1.0f;
            chw.a(z2, "Size multiplier must be between 0 and 1");
            bxl.f = f;
        }
        f = akmu.c.d;
        if (f > 0.0f && f <= 1.0f) {
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            }
            chw.a(z, "Low memory max size multiplier must be between 0 and 1");
            bxl.g = f;
        }
        f = akmu.c.e;
        if (f > 0.0f) {
            bxl.a(f);
        }
        bxm a = bxl.a();
        bra.i = a;
        i = akmu.c.g;
        if (i > 0) {
            bra.e = new bxh((long) (i * 1048576));
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        aort = akmu.c;
        boolean z3 = aort.j;
        int i2 = aort.k;
        z3 = aort.i;
        z3 = aort.l;
        i = aort.m;
        String formatFileSize = Formatter.formatFileSize(context, (long) a.b);
        String formatFileSize2 = Formatter.formatFileSize(context, (long) a.a);
        String formatFileSize3 = Formatter.formatFileSize(context, (long) a.c);
        activityManager.getMemoryClass();
        activityManager.isLowRamDevice();
        int i3 = akmu.c.g;
        String.valueOf(formatFileSize).length();
        String.valueOf(formatFileSize2).length();
        String.valueOf(formatFileSize3).length();
    }

    public final void a(Context context, bqy bqy, brd brd) {
        ton ton = new ton();
        brd.b(InputStream.class, FrameSequenceDrawable.class, new tom(bqy.a));
        brd.b(ByteBuffer.class, FrameSequenceDrawable.class, new tok(bqy.a));
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        akmu akmu = glideLoaderModule.a;
        if (!akmu.c.i) {
            xtl.c("Glide is configured incorrectly and should be using Cronet!");
        }
        brd.b(bzc.class, InputStream.class, new tpe(akmu.a));
        tpf tpf = new tpf(akmu.a);
        brd.a.b(bzc.class, ByteBuffer.class, tpf);
        brd.b(aygk.class, InputStream.class, new akmk());
        brd.b(InputStream.class, byte[].class, new aklm(bqy.d));
        if (akmu.b) {
            brd.b(InputStream.class, FrameSequenceDrawable.class, new tom(bqy.a));
        }
    }

    public final Set b() {
        return Collections.emptySet();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ cfb c() {
        return new bqw();
    }
}
