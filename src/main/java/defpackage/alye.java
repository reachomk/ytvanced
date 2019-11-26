package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.libraries.youtube.upload.service.UploadService;
import com.google.android.youtube.R;
import java.io.File;

/* renamed from: alye */
public final /* synthetic */ class alye implements anij {
    private final alyf a;
    private final String b;
    private final afpt c;
    private final ameo d;
    private final Uri e;
    private final Uri f;
    private final aytx g;
    private final Bitmap h;

    public alye(alyf alyf, String str, afpt afpt, ameo ameo, Uri uri, Uri uri2, aytx aytx, Bitmap bitmap) {
        this.a = alyf;
        this.b = str;
        this.c = afpt;
        this.d = ameo;
        this.e = uri;
        this.f = uri2;
        this.g = aytx;
        this.h = bitmap;
    }

    public final anjv a() {
        alyf alyf = this.a;
        String str = this.b;
        afpt afpt = this.c;
        ameo ameo = this.d;
        Uri uri = this.e;
        Uri uri2 = this.f;
        aytx aytx = this.g;
        Bitmap bitmap = this.h;
        xvd.a(str);
        amqw.a(afpt != afpt.g);
        amqw.a(ameo != null);
        amqw.b(alyf.f.a(str) == null);
        amdz amdz = (amdz) amea.U.createBuilder();
        amdz.c(str);
        amdz.b(uri.toString());
        amdz.a(afpt.a());
        amdz.a(System.currentTimeMillis());
        amdz.a(2);
        amdz.a(ameo);
        amdz.f();
        String valueOf = String.valueOf(alyf.a.getDir("youtube_upload", 0));
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 2) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        valueOf = "/";
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        amdz.f(new File(stringBuilder.toString()).toString());
        alyf.a(alyf.a.getContentResolver(), uri2);
        ayva ayva = alyf.d.b().j;
        if (ayva == null) {
            ayva = ayva.m;
        }
        alyf.a(amdz, ayva);
        if (ayva == null || !ayva.b || VERSION.SDK_INT < 18) {
            amdz.a(amjq.a(10));
        } else {
            SharedPreferences sharedPreferences = alyf.c;
            Resources resources = alyf.a.getResources();
            int a = ayuy.a(ayva.c);
            if (a == 0) {
                a = 1;
            }
            String string = sharedPreferences.getString(alyu.UPLOAD_QUALITY, resources.getString(amfp.a(a)));
            if (TextUtils.equals(string, alyf.a.getString(R.string.upload_quality_value_original))) {
                amdz.a(amjq.a(11));
            } else {
                Resources resources2 = alyf.a.getResources();
                a = !TextUtils.equals(string, resources2.getString(R.string.upload_quality_value_360p)) ? !TextUtils.equals(string, resources2.getString(R.string.upload_quality_value_480p)) ? !TextUtils.equals(string, resources2.getString(R.string.upload_quality_value_720p)) ? !TextUtils.equals(string, resources2.getString(R.string.upload_quality_value_1080p)) ? 1 : 5 : 4 : 3 : 2;
                if (a == 1) {
                    alyf.h.a("addNormalUpload", new AssertionError("Invalid quality preference value."));
                    amdz.a(amjq.a(10));
                } else {
                    amdz.copyOnWrite();
                    amea amea = (amea) amdz.instance;
                    amea.a |= 512;
                    amea.j = a - 1;
                }
            }
        }
        alyf.a(str, amdz);
        Object obj = (amea) ((anxl) amdz.build());
        alyf.f.a(str, (amea) obj);
        alyf.i.a(str, aytx, 2, (aytw[]) alyf.a().toArray(new aytw[0]));
        if (amjq.a(amdz.b())) {
            alyf.i.a((amea) ((anxl) amdz.build()));
        }
        Intent intent = new Intent(alyf.a, UploadService.class);
        intent.setData(uri2);
        intent.setFlags(1);
        alyf.a.startService(intent);
        amct a2 = amct.a(str).a(bitmap).a();
        amde amde = (amde) alyf.j.b(alyf.a);
        amde.c();
        alyf.l.a(a2);
        amde.a(a2);
        return anjf.a(obj);
    }
}
