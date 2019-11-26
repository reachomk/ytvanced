package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.libraries.youtube.comment.image.ImageGridRecyclerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;

/* renamed from: wgq */
public final class wgq extends nf {
    public static final String[] a = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private ImageGridRecyclerView Z;
    private wgy aa;
    private ViewStub ab;
    private View ac;
    public wgu b;
    private int c;

    public static wgq a(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) {
        amqw.a((Object) backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        wgq wgq = new wgq();
        Bundle bundle = new Bundle();
        bundle.putParcelable("image_upload_endpoint", aobp.a(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint));
        wgq.f(bundle);
        return wgq;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        try {
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) aobp.a(this.j, "image_upload_endpoint", BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.f, anxa.c());
            apbi apbi = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d;
            if (apbi == null) {
                apbi = apbi.e;
            }
            if (apbi.d != 0) {
                apbi apbi2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d;
                if (apbi2 == null) {
                    apbi2 = apbi.e;
                }
                this.c = apbi2.d;
            }
        } catch (anyg e) {
            throw new IllegalStateException(e);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_gallery_fragment, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.gallery_dismiss_button)).setOnClickListener(new wgt(this));
        this.Z = (ImageGridRecyclerView) inflate.findViewById(R.id.image_grid_recycler_view);
        this.ab = (ViewStub) inflate.findViewById(R.id.zero_state_stub);
        this.aa = new wgy(p(), this.Z.T, new wgs(this), this.c);
        this.Z.a(this.aa);
        this.Z.a(this.aa.g);
        return inflate;
    }

    public final void W_() {
        super.W_();
        Cursor query = p().getContentResolver().query(Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_size"}, null, null, "date_modified DESC");
        wgy wgy = this.aa;
        wgy.f.a = query;
        wgy.e.b();
        if (query.getCount() != 0) {
            View view = this.ac;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (F_()) {
            if (this.ac == null) {
                this.ac = this.ab.inflate();
                Resources resources = p().getResources();
                this.ac.setBackgroundDrawable(new whw(resources.getDimensionPixelSize(R.dimen.image_gallery_thumbnail_min_width), resources.getDimensionPixelSize(R.dimen.image_gallery_thumbnail_margin), ra.c(p(), R.color.image_gallery_zero_state_grid_divider_color)));
            }
            this.ac.setVisibility(0);
        }
    }
}
