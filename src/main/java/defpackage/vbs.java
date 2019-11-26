package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: vbs */
public final class vbs extends nf {
    private CountDownTimer Z;
    public long a;
    public vbx b;
    private avxh c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((vbu) xse.a(this.y)).a(this);
        byte[] byteArray = this.j.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.c = (avxh) anxl.parseFrom(avxh.c, byteArray, anxa.c());
            } catch (anyg e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
        if (bundle != null) {
            this.a = bundle.getLong("SAVED_TIME_REMAINING_MILLIS");
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context a = vad.a(p());
        layoutInflater = layoutInflater.cloneInContext(a);
        FrameLayout frameLayout = new FrameLayout(a);
        frameLayout.addView(a(frameLayout, layoutInflater));
        return frameLayout;
    }

    private final View a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.verification_result_success_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        avxh avxh = this.c;
        if (!(avxh == null || (avxh.a & 1) == 0)) {
            arml arml = avxh.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        return inflate;
    }

    public final void e(Bundle bundle) {
        bundle.putLong("SAVED_TIME_REMAINING_MILLIS", this.a);
    }

    public final void B() {
        super.B();
        long j = this.a;
        if (j == 0) {
            j = 3000;
        }
        this.Z = new vbv(this, j);
        this.Z.start();
    }

    public final void ad_() {
        super.ad_();
        this.Z.cancel();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nn p = p();
        View view = this.K;
        if (p != null && view != null && (view instanceof ViewGroup)) {
            Bundle bundle = new Bundle();
            LayoutInflater cloneInContext = ((LayoutInflater) p.getSystemService("layout_inflater")).cloneInContext(vad.a(p));
            e(bundle);
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup, cloneInContext);
            viewGroup.removeAllViews();
            viewGroup.addView(a);
        }
    }
}
