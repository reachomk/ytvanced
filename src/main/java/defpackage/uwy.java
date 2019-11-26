package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.libraries.youtube.account.photo.CropActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: uwy */
public final class uwy extends nf {
    private static final Intent ai = new Intent();
    public Executor Z;
    public uwx a;
    public aaqn aa;
    public aaas ab;
    public xoi ac;
    public SharedPreferences ad;
    public UploadPhotoEndpointOuterClass$UploadPhotoEndpoint ae;
    public Uri af;
    public String ag;
    public boolean ah;
    private GetPhotoEndpointOuterClass$GetPhotoEndpoint aj;
    private Uri ak;
    private boolean al;
    private boolean am;
    public uxe b;
    public ScheduledExecutorService c;

    static uwy a(GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("arg_get_photo_model", getPhotoEndpointOuterClass$GetPhotoEndpoint.toByteArray());
        uwy uwy = new uwy();
        uwy.f(bundle);
        return uwy;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        ((uxf) ((xfc) p()).n()).a(this);
        try {
            this.aj = (GetPhotoEndpointOuterClass$GetPhotoEndpoint) anxl.parseFrom(GetPhotoEndpointOuterClass$GetPhotoEndpoint.f, this.j.getByteArray("arg_get_photo_model"));
            if (bundle != null) {
                this.ak = (Uri) bundle.getParcelable("arg_photo_uri");
                this.af = (Uri) bundle.getParcelable("arg_crop_uri");
                this.ag = bundle.getString("arg_fife_url");
                this.al = bundle.getBoolean("arg_get_photo_finished", this.al);
                this.am = bundle.getBoolean("arg_crop_photo_finished", this.am);
                this.ah = bundle.getBoolean("arg_dismissed", this.ah);
                String str = "arg_upload_photo_endpoint";
                if (bundle.containsKey(str)) {
                    try {
                        this.ae = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) anxl.parseFrom(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.h, bundle.getByteArray(str), anxa.c());
                    } catch (anyg unused) {
                    }
                }
            }
            X();
        } catch (anyg unused2) {
            throw new RuntimeException("Miracles do happen");
        }
    }

    public final void e(Bundle bundle) {
        Uri uri = this.ak;
        if (uri != null) {
            bundle.putParcelable("arg_photo_uri", uri);
        }
        uri = this.af;
        if (uri != null) {
            bundle.putParcelable("arg_crop_uri", uri);
        }
        String str = this.ag;
        if (str != null) {
            bundle.putString("arg_fife_url", str);
        }
        if (this.al) {
            bundle.putBoolean("arg_get_photo_finished", true);
        }
        if (this.am) {
            bundle.putBoolean("arg_crop_photo_finished", true);
        }
        if (this.ah) {
            bundle.putBoolean("arg_dismissed", true);
        }
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ae;
        if (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint != null) {
            bundle.putByteArray("arg_upload_photo_endpoint", uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.toByteArray());
        }
    }

    public final void a(int i, int i2, Intent intent) {
        if (i2 != -1) {
            if (i2 == 0) {
                aa();
            } else if (i == 2 && i2 == 2) {
                arrb arrb = this.aj.d;
                if (arrb == null) {
                    arrb = arrb.i;
                }
                i = arrb.d;
                arrb arrb2 = this.aj.d;
                if (arrb2 == null) {
                    arrb2 = arrb.i;
                }
                i2 = arrb2.e;
                String string = q().getString(R.string.crop_photo_too_small, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                StringBuilder stringBuilder = new StringBuilder(69);
                stringBuilder.append("Selected image is too small. Must be at least ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                a(string, new uwz(stringBuilder.toString()));
            } else {
                a(q().getString(R.string.photo_upload_something_went_wrong), new uwz("Unknown activity result code"));
            }
        } else if (i == 1) {
            Uri uri = this.ak;
            if (uri == null) {
                uri = intent.getData();
            }
            this.ak = uri;
            if (this.ak == null) {
                a(q().getString(R.string.photo_upload_something_went_wrong), new uwz("Failed to get photo uri"));
                return;
            }
            this.al = true;
            Y();
        } else if (i != 2) {
            a(q().getString(R.string.photo_upload_something_went_wrong), new uwz("Unknown activity request code"));
        } else {
            this.am = true;
            Z();
        }
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        int i2 = 0;
        amqw.a(i == 3);
        i = iArr.length;
        while (i2 < i) {
            if (iArr[i2] != -1) {
                i2++;
            } else {
                aa();
                return;
            }
        }
        X();
    }

    private final void X() {
        if (this.ah) {
            this.a.c();
        } else {
            UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ae;
            if (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint != null) {
                a(uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
            } else if (!this.al) {
                Intent intent;
                int a = arrd.a(this.aj.b);
                if (a == 0) {
                    a = 1;
                }
                a--;
                if (a == 1) {
                    try {
                        if (VERSION.SDK_INT >= 23) {
                            if (!a("android.permission.CAMERA")) {
                                intent = ai;
                            }
                        }
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        this.ak = rc.a(M_(), "com.google.android.youtube.fileprovider", uwy.b(M_()));
                        intent.putExtra("output", this.ak);
                        intent.setClipData(ClipData.newUri(M_().getContentResolver(), "photos", this.ak));
                        intent.setFlags(3);
                    } catch (uwz e) {
                        a(q().getString(R.string.photo_upload_something_went_wrong), e);
                        return;
                    }
                } else if (a != 2) {
                    a(q().getString(R.string.photo_upload_something_went_wrong), new uwz("Unknown get photo action."));
                    return;
                } else {
                    if (VERSION.SDK_INT >= 23) {
                        if (!a("android.permission.READ_EXTERNAL_STORAGE")) {
                            intent = ai;
                        }
                    }
                    intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    intent.addCategory("android.intent.category.OPENABLE");
                }
                if (intent != ai) {
                    if (intent == null || intent.resolveActivity(p().getPackageManager()) == null) {
                        a(q().getString(R.string.photo_upload_something_went_wrong), new uwz("Unable to start get photo action."));
                    } else {
                        startActivityForResult(intent, 1);
                    }
                }
            } else if (this.am) {
                Z();
            } else {
                Y();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint) {
        this.ae = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) amqw.a((Object) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
        if (this.ag == null) {
            int i = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.a;
            if ((i & 1) == 0 && (i & 2) == 0) {
                String str = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.d;
                this.c.execute(new uxb(this, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.e, str, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint));
                return;
            }
            arml arml;
            if ((i & 64) != 0) {
                arml = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a(ajqy.a(arml).toString(), new uwz("OwnerId or albumId was not set."));
            return;
        }
        f();
    }

    private final void Y() {
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint = this.aj;
        if ((getPhotoEndpointOuterClass$GetPhotoEndpoint.a & 4) != 0) {
            try {
                arml arml;
                arrb arrb = getPhotoEndpointOuterClass$GetPhotoEndpoint.d;
                if (arrb == null) {
                    arrb = arrb.i;
                }
                Intent intent = new Intent(p(), CropActivity.class);
                intent.setData(this.ak);
                this.af = Uri.fromFile(uwy.b(M_()));
                intent.putExtra("output", this.af);
                intent.putExtra("widthRatio", arrb.b);
                intent.putExtra("heightRatio", arrb.c);
                int i = arrb.d;
                if (i > 0) {
                    intent.putExtra("minWidth", i);
                }
                i = arrb.e;
                if (i > 0) {
                    intent.putExtra("minHeight", i);
                }
                i = arrb.f;
                if (i > 0) {
                    intent.putExtra("visualWidthRatio", i);
                }
                i = arrb.g;
                if (i > 0) {
                    intent.putExtra("visualHeightRatio", i);
                }
                int i2 = arrb.h;
                if (i2 > 0) {
                    intent.putExtra("visualDoubleWidthRatio", i2);
                }
                String str = "cropInfo";
                GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint2 = this.aj;
                if ((getPhotoEndpointOuterClass$GetPhotoEndpoint2.a & 8) != 0) {
                    arml = getPhotoEndpointOuterClass$GetPhotoEndpoint2.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                intent.putExtra(str, aabb.a(arml, this.a.d(), true));
                startActivityForResult(intent, 2);
                return;
            } catch (uwz e) {
                a(q().getString(R.string.photo_upload_something_went_wrong), e);
                return;
            }
        }
        this.af = this.ak;
        Z();
    }

    private final void Z() {
        if (this.af == null) {
            a(q().getString(R.string.photo_upload_something_went_wrong), new uwz());
            return;
        }
        aphj aphj = this.aj.c;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        int i = aphg.a;
        aaas aaas;
        apxu apxu;
        if ((i & 4096) != 0) {
            aaas = this.ab;
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        } else if ((i & 2048) != 0) {
            aaas = this.ab;
            apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        } else {
            a(q().getString(R.string.photo_upload_something_went_wrong), new uwz("No endpoint to resolve after cropping a photo."));
        }
    }

    public final void f() {
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ae;
        int i = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b;
        if (i == 3) {
            this.ab.a((apxu) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.c, null);
        } else if (i == 2) {
            this.ab.a((apxu) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.c, null);
        } else {
            W();
        }
    }

    public final void W() {
        arml arml;
        this.ah = true;
        xoi xoi = this.ac;
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ae;
        if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.a & 32) != 0) {
            arml = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xoi.a(ajqy.a(arml).toString());
        this.a.e();
    }

    public final void a(String str, uwz uwz) {
        this.ah = true;
        this.ac.a(str);
        this.a.a((Throwable) uwz);
    }

    private final void aa() {
        this.ah = true;
        this.a.f();
    }

    private final boolean a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        String str = strArr[0];
        if (ra.a(p(), str) == -1) {
            arrayList.add(str);
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        String str2 = "permissions_requested";
        Set stringSet = this.ad.getStringSet(str2, null);
        if (!(stringSet == null || stringSet.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (stringSet.contains(str3) && !a_(str3)) {
                    arrayList2.add(str3);
                    it.remove();
                }
            }
        }
        if (!arrayList.isEmpty()) {
            HashSet hashSet = new HashSet(arrayList);
            if (stringSet != null) {
                hashSet.addAll(stringSet);
            }
            this.ad.edit().putStringSet(str2, hashSet).commit();
            a((String[]) arrayList.toArray(new String[0]), 3);
        } else if (!arrayList2.isEmpty()) {
            this.ah = true;
            amqw.a(arrayList2.isEmpty() ^ 1);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("permissions", arrayList2);
            nf uwq = new uwq();
            uwq.f(bundle);
            ((nt) amqw.a(this.v)).a().a(uwq, "photo_upload_permission_fragment").b();
        }
        return false;
    }

    private static File b(Context context) {
        try {
            File file = new File(context.getCacheDir(), "photos");
            if (!file.exists()) {
                file.mkdir();
            }
            return File.createTempFile("photo", ".jpeg", file);
        } catch (IOException e) {
            throw new uwz("Failed to create temp photo file.", e);
        }
    }
}
