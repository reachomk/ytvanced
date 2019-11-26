package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: muo */
public final class muo extends aiua implements msx {
    private final RecyclerView a;
    private final anm b;
    private final TextView c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private WeakReference e;
    private muw f;

    public muo(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.relateds_overlay, this);
        this.b = new anm(1);
        this.a = new RecyclerView(context);
        this.a.a(this.b);
        this.a.a(new mus(this.b, this.d));
        this.a.a(new mut());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 8);
        this.a.setLayoutParams(layoutParams);
        ((FixedAspectRatioRelativeLayout) findViewById(R.id.related_video_fixed_aspect_ratio_layout)).addView(this.a);
        this.c = (TextView) findViewById(R.id.related_overlay_title);
        findViewById(R.id.exit_related_page_button).setOnClickListener(new mur(this));
        setVisibility(4);
        setOnClickListener(muq.a);
    }

    public final void aI_() {
    }

    public final void a(myv myv, ISelectableItemRegistryService iSelectableItemRegistryService) {
        this.e = new WeakReference(iSelectableItemRegistryService);
        this.f = new muw(myv, this.e, this.d);
        this.a.a(this.f);
    }

    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void a(ngn ngn) {
        if (ngn != null && ngn.a().equals(ngq.RELATED_VIDEOS_SCREEN)) {
            nhf nhf = (nhf) ngn;
            nhd[] nhdArr = nhf.c;
            if (nhdArr == null || nhf.equals(nhf.a) || nhdArr.length == 0 || nhdArr[0].equals(nhd.a)) {
                this.f.a(null);
                this.b.e(0);
                setVisibility(8);
            } else {
                this.f.a(nhdArr);
                this.c.setText(nhf.b);
                setVisibility(0);
            }
        }
    }
}
