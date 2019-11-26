package com.google.android.libraries.youtube.comment.image;

import android.os.Bundle;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import defpackage.aaax;
import defpackage.alaf;
import defpackage.amqw;
import defpackage.anxl;
import defpackage.anxp;
import defpackage.anxr;
import defpackage.apav;
import defpackage.nf;
import defpackage.nn;
import defpackage.or;
import defpackage.wfz;
import defpackage.wga;
import defpackage.wgo;
import defpackage.wgp;
import defpackage.wgq;
import defpackage.wgr;
import defpackage.wgu;
import defpackage.whd;
import defpackage.xev;
import defpackage.xfc;
import defpackage.xse;
import defpackage.xtl;

public class ImageGalleryActivity extends nn implements wgu, xfc {
    public whd g;
    private wgo h;
    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint i;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g().a(this);
        setContentView(R.layout.image_gallery_activity);
        getWindow().setFlags(1024, 1024);
        bundle = getIntent().getExtras();
        anxp anxp = null;
        byte[] byteArray = bundle != null ? bundle.getByteArray("navigation_endpoint") : null;
        if (byteArray != null) {
            anxp = aaax.a(byteArray);
        }
        if (anxp != null) {
            anxr access$000 = anxl.checkIsLite(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                this.i = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) obj;
                String[] a = alaf.a(this, wgq.a);
                if (a.length == 0) {
                    a(this.i);
                    return;
                }
                BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.i;
                Object string = getResources().getString(R.string.image_gallery_permission_allow_access_description);
                Object string2 = getResources().getString(R.string.image_gallery_permission_open_settings_description);
                amqw.a(true);
                amqw.a(string);
                amqw.a(string2);
                alaf alaf = new alaf();
                Bundle bundle2 = new Bundle();
                bundle2.putStringArray("missing_permissions", a);
                bundle2.putCharSequence("allow_access_description", string);
                bundle2.putCharSequence("open_settings_description", string2);
                alaf.f(bundle2);
                alaf.b = new wgp(this, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
                b(alaf);
                return;
            }
        }
        xtl.c("BackstageImageUploadEndpoint is missing.");
    }

    private final wgo g() {
        if (this.h == null) {
            this.h = ((wgr) xse.a(getApplication())).b(new xev(this));
        }
        return this.h;
    }

    public final void a(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) {
        wgq a = wgq.a(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        a.b = this;
        b(a);
    }

    private final void b(nf nfVar) {
        or a = f().a();
        a.b(R.id.fragment_container, nfVar);
        a.b();
    }

    public final void a(wga wga) {
        apav apav = this.i.e;
        if (apav == null) {
            apav = apav.c;
        }
        if (apav.a == 135384379) {
            b(wfz.a(this.i, wga.a));
            return;
        }
        onBackPressed();
        whd whd = this.g;
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.i;
        whd.a(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.b, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c, wga.a);
    }

    public final /* synthetic */ Object n() {
        return g();
    }
}
