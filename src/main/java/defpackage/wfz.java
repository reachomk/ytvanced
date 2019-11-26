package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: wfz */
public final class wfz extends nf {
    private static final wfx[] af = new wfx[]{new wfx("Normal", "NORMAL"), new wfx("Sketch", "SKETCH_IMAGE_FILTER"), new wfx("Sepia", "SEPIA_IMAGE_FILTER")};
    public wgm Z;
    public Executor a;
    public String aa;
    public String ab;
    public ImageView ac;
    public Bitmap ad;
    private Uri ae;
    public whd b;
    public afnw c;

    public static wfz a(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, Uri uri) {
        amqw.a((Object) backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        wfz wfz = new wfz();
        Bundle bundle = new Bundle();
        aobp.a(bundle, "image_upload_endpoint", (anze) backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        bundle.putParcelable("image_uri", uri);
        wfz.f(bundle);
        return wfz;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wgf) xse.a(p())).a(this);
        Object obj = this.j;
        amqw.a(obj);
        try {
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) aobp.a(obj, "image_upload_endpoint", BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.f, anxa.c());
            this.aa = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.b;
            this.ab = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c;
            this.ae = (Uri) amqw.a((Uri) obj.getParcelable("image_uri"));
        } catch (anyg e) {
            throw new IllegalStateException(e);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.image_edit_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.image_filter_layout);
        this.ac = (ImageView) inflate.findViewById(R.id.preview_image);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.d((int) R.menu.image_edit_action_menu);
        toolbar.q = new wgd(this);
        toolbar.a(new wgb(this));
        toolbar.f().findItem(R.id.done_button).setTitle(a((int) R.string.done));
        this.a.execute(new wgc(this, this.ae));
        wgm wgm = this.Z;
        wfx[] wfxArr = af;
        ImageView imageView = this.ac;
        wgm.d = wfxArr;
        wgm.c = linearLayout;
        wgm.b = 0;
        wgi wgi = wgm.e;
        wgi.b = new Graph();
        anuu.a(wgi.a);
        Context context = wgi.a;
        AndroidAssetUtil.nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        try {
            Graph graph = wgi.b;
            InputStream open = wgi.a.getAssets().open("image_preview_supergraph.binarypb");
            byte[] a = anaz.a(open);
            open.close();
            graph.a(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (MediaPipeException unused) {
        }
        int i = 0;
        while (true) {
            wfxArr = wgm.d;
            if (i < wfxArr.length) {
                wfx wfx = wfxArr[i];
                ViewGroup viewGroup2 = wgm.c;
                View inflate2 = LayoutInflater.from(wgm.a).inflate(R.layout.image_filter_list_item, viewGroup2, z);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(4);
                ((ViewGroup) inflate2).setLayoutTransition(layoutTransition);
                ((TextView) inflate2.findViewById(R.id.filter_text)).setText(wfx.a);
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.filter_thumbnail);
                imageView2.setImageDrawable(new ColorDrawable(-16777216));
                int childCount = viewGroup2.getChildCount();
                inflate2.setOnClickListener(new wgl(wgm, childCount, imageView));
                wgi wgi2 = wgm.e;
                wgn wgn = new wgn(wgm, imageView2, childCount, imageView);
                String str = !wfx.a.equals("Normal") ? "_image_filter_preview" : "_preview";
                String toLowerCase = wfx.a.toLowerCase(Locale.US);
                String str2 = "render_";
                StringBuilder stringBuilder = new StringBuilder((str2.length() + String.valueOf(toLowerCase).length()) + str.length());
                stringBuilder.append(str2);
                stringBuilder.append(toLowerCase);
                stringBuilder.append(str);
                wgi2.b.a(stringBuilder.toString(), new wgh(wgn));
                viewGroup2.addView(inflate2);
                i++;
                z = false;
            } else {
                wgm.a();
                return inflate;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
    /* JADX WARNING: Failed to process nested try/catch */
    public final void i() {
        /*
        r2 = this;
        super.i();
        r0 = r2.Z;
        r0 = r0.e;
        r1 = r0.b;	 Catch:{ MediaPipeException -> 0x000c }
        r1.c();	 Catch:{ MediaPipeException -> 0x000c }
    L_0x000c:
        r1 = r0.b;	 Catch:{ MediaPipeException -> 0x0011 }
        r1.d();	 Catch:{ MediaPipeException -> 0x0011 }
    L_0x0011:
        r0 = r0.b;
        r0.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfz.i():void");
    }
}
