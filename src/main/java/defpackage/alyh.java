package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

/* renamed from: alyh */
public final /* synthetic */ class alyh implements anij {
    private final alyf a;
    private final String b;
    private final afpt c;
    private final File d;
    private final Bitmap e;
    private final Uri f;
    private final boolean g;
    private final String[] h;
    private final String i;
    private final askm j;
    private final byte[] k;
    private final String[] l;
    private final azaz m;
    private final boolean n;

    public alyh(alyf alyf, String str, afpt afpt, File file, Bitmap bitmap, Uri uri, boolean z, String[] strArr, String str2, askm askm, byte[] bArr, String[] strArr2, azaz azaz, boolean z2) {
        this.a = alyf;
        this.b = str;
        this.c = afpt;
        this.d = file;
        this.e = bitmap;
        this.f = uri;
        this.g = z;
        this.h = strArr;
        this.i = str2;
        this.j = askm;
        this.k = bArr;
        this.l = strArr2;
        this.m = azaz;
        this.n = z2;
    }

    public final anjv a() {
        File file;
        azaz azaz;
        Object[] objArr;
        byte[] bArr;
        aytx aytx;
        alyf alyf = this.a;
        String str = this.b;
        afpt afpt = this.c;
        File file2 = this.d;
        Bitmap bitmap = this.e;
        Uri uri = this.f;
        boolean z = this.g;
        String[] strArr = this.h;
        String str2 = this.i;
        askm askm = this.j;
        byte[] bArr2 = this.k;
        String[] strArr2 = this.l;
        azaz azaz2 = this.m;
        boolean z2 = this.n;
        xvd.a(str);
        amqw.a(afpt != afpt.g);
        boolean z3 = z2;
        alyf alyf2 = alyf;
        String valueOf = String.valueOf(alyf.a.getDir("youtube_upload", 0));
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 2) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        valueOf = "/";
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        File file3 = new File(stringBuilder.toString());
        if (!((file2 == null && bitmap == null) || file3.exists())) {
            file3.mkdirs();
        }
        if (file2 != null) {
            file = new File(file3, "video_effects_state");
            file.createNewFile();
            amqw.a(file2.exists());
            amqw.a(file.exists());
            FileInputStream fileInputStream = new FileInputStream(file2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            azaz = azaz2;
            byte[] bArr3 = new byte[1024];
            objArr = strArr2;
            while (true) {
                int read = fileInputStream.read(bArr3);
                if (read <= 0) {
                    break;
                }
                bArr = bArr2;
                fileOutputStream.write(bArr3, 0, read);
                Arrays.fill(bArr3, (byte) 0);
                bArr2 = bArr;
            }
            bArr = bArr2;
            fileInputStream.close();
            fileOutputStream.close();
            file2.delete();
            uri = uri.buildUpon().appendQueryParameter("videoEffectsStateFilePath", file.getAbsolutePath()).build();
        } else {
            bArr = bArr2;
            objArr = strArr2;
            azaz = azaz2;
        }
        if (bitmap != null) {
            file = new File(file3, "video_thumbnail.jpg");
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            bitmap.compress(CompressFormat.JPEG, 60, fileOutputStream2);
            fileOutputStream2.close();
            uri = uri.buildUpon().appendQueryParameter("videoThumbnailFilePath", file.getAbsolutePath()).build();
        }
        amdz amdz = (amdz) amea.U.createBuilder();
        amdz.c(str);
        amdz.b(uri.toString());
        amdz.a(afpt.a());
        amdz.a(System.currentTimeMillis());
        amdz.a(5);
        amdz.copyOnWrite();
        amea amea = (amea) amdz.instance;
        amea.b |= 2048;
        amea.T = z;
        List asList = Arrays.asList(strArr);
        amdz.copyOnWrite();
        amea amea2 = (amea) amdz.instance;
        if (!amea2.x.a()) {
            amea2.x = anxl.mutableCopy(amea2.x);
        }
        anvf.addAll(asList, amea2.x);
        amdz.f();
        if (str2 != null) {
            amdz.copyOnWrite();
            amea = (amea) amdz.instance;
            amea.a |= 16777216;
            amea.A = str2;
        }
        if (!(askm == null || askm.b.isEmpty())) {
            amds amds = (amds) amdp.c.createBuilder();
            String str3 = askm.b;
            amds.copyOnWrite();
            amdp amdp = (amdp) amds.instance;
            if (str3 != null) {
                amdp.a |= 1;
                amdp.b = str3;
                amdp amdp2 = (amdp) ((anxl) amds.build());
                amdz.copyOnWrite();
                amea2 = (amea) amdz.instance;
                if (amdp2 != null) {
                    amea2.z = amdp2;
                    amea2.a |= 8388608;
                } else {
                    throw new NullPointerException();
                }
            }
            throw new NullPointerException();
        }
        amdz.f(file3.toString());
        if (bArr != null) {
            anvu a = anvu.a(bArr);
            amdz.copyOnWrite();
            amea2 = (amea) amdz.instance;
            if (a != null) {
                amea2.a |= 256;
                amea2.i = a;
            } else {
                throw new NullPointerException();
            }
        }
        if (objArr != null) {
            asList = Arrays.asList(objArr);
            amdz.copyOnWrite();
            amea2 = (amea) amdz.instance;
            if (!amea2.B.a()) {
                amea2.B = anxl.mutableCopy(amea2.B);
            }
            anvf.addAll(asList, amea2.B);
        }
        if (azaz != null) {
            amdz.copyOnWrite();
            amea = (amea) amdz.instance;
            amea.E = azaz;
            amea.a |= 134217728;
        }
        amdz.a(amjq.a(10));
        alyf = alyf2;
        alyf.a(alyf.a.getContentResolver(), uri);
        ayva ayva = alyf.d.b().j;
        if (ayva == null) {
            ayva = ayva.m;
        }
        alyf.a(amdz, ayva);
        alyf.a(str, amdz);
        Object obj = (amea) ((anxl) amdz.build());
        alyf.f.a(str, (amea) obj);
        List a2 = alyf.a();
        if (z) {
            a2.add(aytw.UPLOAD_FEATURE_PHOTO);
        }
        ambw ambw = alyf.i;
        if (z3) {
            aytx = aytx.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
        } else {
            aytx = aytx.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA;
        }
        ambw.a(str, aytx, 3, (aytw[]) a2.toArray(new aytw[0]));
        alyf.i.a((amea) ((anxl) amdz.build()));
        amct a3 = amct.a(str).a(bArr).a(bitmap).a();
        amde amde = (amde) alyf.j.b(alyf.a);
        amde.c();
        alyf.l.a(a3);
        amde.a(a3);
        return anjf.a(obj);
    }
}
