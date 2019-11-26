package defpackage;

import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;

/* renamed from: wgp */
public final class wgp implements alaj {
    private final /* synthetic */ BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint a;
    private final /* synthetic */ ImageGalleryActivity b;

    public wgp(ImageGalleryActivity imageGalleryActivity, BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) {
        this.b = imageGalleryActivity;
        this.a = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
    }

    public final void a() {
        this.b.a(this.a);
    }
}
