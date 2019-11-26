package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;

/* renamed from: amfg */
public final class amfg implements amev {
    private final File a;
    private final File b;
    private final File c;
    private final xsc d;

    public static boolean a(Uri uri) {
        if (uri != null) {
            if ("streaming".equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return false;
    }

    public amfg(Uri uri, xsc xsc) {
        amqw.a(amfg.a(uri));
        this.d = xsc;
        String queryParameter = uri.getQueryParameter("temp");
        boolean z = false;
        boolean z2 = (queryParameter == null || queryParameter.isEmpty()) ? false : true;
        amqw.a(z2);
        this.a = new File(queryParameter);
        queryParameter = uri.getPath();
        if (!(queryParameter == null || queryParameter.isEmpty())) {
            z = true;
        }
        amqw.a(z);
        this.b = new File(queryParameter);
        String queryParameter2 = uri.getQueryParameter("camera_roll");
        File file = null;
        if (!(queryParameter2 == null || queryParameter2.isEmpty())) {
            file = new File(queryParameter2);
        }
        this.c = file;
        amqw.a(this.a.equals(this.b) ^ 1);
    }

    public final amey a(File file) {
        long a = this.d.a();
        while (!this.a.canRead()) {
            if (this.b.canRead()) {
                return b();
            }
            if (this.d.a() - a < 3000) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    String str;
                    Thread.currentThread().interrupt();
                    if (e.getMessage() == null) {
                        str = "";
                    } else {
                        str = e.getMessage();
                    }
                    throw new InterruptedIOException(str);
                }
            }
            throw new FileNotFoundException(String.format("File %s not found.", new Object[]{this.a}));
        }
        try {
            return new amfc(this.a, this.b, this.d);
        } catch (FileNotFoundException e2) {
            if (this.b.canRead()) {
                return b();
            }
            throw e2;
        }
    }

    public final Bitmap a(Point point) {
        if (this.c == null) {
            return null;
        }
        int i = 1;
        if (point.x <= 96 && point.y <= 96) {
            i = 3;
        }
        return ThumbnailUtils.createVideoThumbnail(this.c.getAbsolutePath(), i);
    }

    public final ayuo a(String str, String str2) {
        ayur ayur = (ayur) ayuo.d.createBuilder();
        axca axca = (axca) axcb.c.createBuilder();
        axca.a(str);
        axcb axcb = (axcb) ((anxl) axca.build());
        aqzr aqzr = aqzr.b;
        File file = new File(str2, "video_edit_proto");
        if (file.exists()) {
            aqzr = (aqzr) anxl.parseFrom(aqzr.b, anbk.b(file), anxa.c());
        }
        if (aqzr.a.size() == 1) {
            arag arag = (arag) arah.c.createBuilder();
            arag.a(axcb);
            arah arah = (arah) ((anxl) arag.build());
            araf araf = (araf) ((anxo) ((arac) aqzr.a.get(0)).toBuilder());
            araf.a(arah);
            arac arac = (arac) ((anxl) araf.build());
            aqzq aqzq = (aqzq) ((anxo) aqzr.toBuilder());
            aqzq.copyOnWrite();
            aqzr = (aqzr) aqzq.instance;
            if (arac != null) {
                aqzr.a();
                aqzr.a.set(0, arac);
                ayur.copyOnWrite();
                ayuo ayuo = (ayuo) ayur.instance;
                ayuo.c = (aqzr) ((anxl) aqzq.build());
                ayuo.a |= 2;
            } else {
                throw new NullPointerException();
            }
        }
        ayur.a(axcb);
        return (ayuo) ((anxl) ayur.build());
    }

    private final amey b() {
        return new amey(new FileInputStream(this.b), this.b.length());
    }
}
