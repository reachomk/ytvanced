package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: iqp */
public final class iqp extends nd {
    private axny Z;
    private axny aa;
    private boolean ab;
    private LinearLayout ac;
    private LinearLayout ad;
    private List ae;
    private List af;

    static void a(irr irr, axny axny) {
        if (axny != null && irr != null && irr.v != null) {
            iqp iqp = new iqp();
            Bundle bundle = new Bundle();
            bundle.putParcelable("innertube_search_filters", aobp.a(axny));
            iqp.f(bundle);
            iqp.a(irr.v, "FilterDialogFragment");
            iqp.a((nf) irr);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(1, 0);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        Bundle bundle2 = bundle;
        axny axny = this.Z;
        if (axny != null) {
            this.aa = axny;
        } else {
            String str = "innertube_search_filters";
            if (bundle2 == null || !bundle2.containsKey(str)) {
                bundle2 = this.j;
                if (bundle2 != null && bundle2.containsKey(str)) {
                    this.aa = (axny) aobp.a(bundle2, str, axny.b, anxa.c());
                }
            } else {
                try {
                    this.aa = (axny) aobp.a(bundle2, str, axny.b, anxa.c());
                } catch (anyg unused) {
                }
            }
        }
        ((iqq) xse.a(p())).kb();
        ViewGroup viewGroup2 = null;
        View inflate = layoutInflater2.inflate(R.layout.search_results_innertube_filter_dialog, null);
        this.ac = (LinearLayout) inflate.findViewById(R.id.dialog_spinners);
        this.ad = (LinearLayout) inflate.findViewById(R.id.dialog_clouds);
        Context M_ = M_();
        this.ae = new ArrayList();
        this.af = new ArrayList();
        axny axny2 = this.aa;
        if (axny2 == null || axny2.a.size() == 0) {
            dismiss();
            return inflate;
        }
        int i = 0;
        for (axnu axnu : this.aa.a) {
            int i2;
            arml arml;
            if (axnu.c) {
                LinearLayout linearLayout = (LinearLayout) layoutInflater2.inflate(R.layout.search_results_innertube_filter_dialog_cloud, null);
                YouTubeTextView youTubeTextView = (YouTubeTextView) linearLayout.findViewById(R.id.label);
                arml arml2 = axnu.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                youTubeTextView.setText(ajqy.a(arml2));
                ChipCloudView chipCloudView = (ChipCloudView) linearLayout.findViewById(R.id.cloud);
                for (axnw axnw : axnu.b) {
                    arml = axnw.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    String obj = ajqy.a(arml).toString();
                    int a = axoa.a(axnw.c);
                    boolean z = a != 0 && a == 3;
                    int i3 = axnw.c;
                    fej fej = new fej(M_);
                    fej.a(xss.a(M_.getResources().getDisplayMetrics(), 48));
                    aptk aptk = (aptk) aptl.i.createBuilder();
                    aptk.a(ajqy.a(obj));
                    aptk.a(z);
                    aptm aptm = (aptm) aptn.c.createBuilder();
                    aptm.a(1);
                    aptk.a(aptm);
                    fej.a((aptl) ((anxl) aptk.build()));
                    fej.setAccessibilityDelegate(new iqs(fej));
                    fej.setOnClickListener(new iqt(fej));
                    chipCloudView.addView(fej);
                }
                chipCloudView.a(Integer.MAX_VALUE);
                this.ad.addView(linearLayout);
                i2 = i + 1;
                chipCloudView.setTag(Integer.valueOf(i));
                this.af.add(chipCloudView);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater2.inflate(R.layout.search_results_innertube_filter_dialog_spinner, viewGroup2);
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) linearLayout2.findViewById(R.id.label);
                arml = axnu.d;
                if (arml == null) {
                    arml = arml.f;
                }
                youTubeTextView2.setText(ajqy.a(arml));
                Spinner spinner = (Spinner) linearLayout2.findViewById(R.id.spinner);
                Context context = spinner.getContext();
                iqv iqv = new iqv(context, context);
                iqv.setDropDownViewResource(R.layout.spinner_dropdown_item);
                int i4 = 0;
                for (int i5 = 0; i5 < axnu.b.size(); i5++) {
                    axnw axnw2 = (axnw) axnu.b.get(i5);
                    arml arml3 = axnw2.b;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                    iqv.add(ajqy.a(arml3).toString());
                    i2 = axoa.a(axnw2.c);
                    if (i2 != 0 && i2 == 3) {
                        i4 = i5;
                    }
                }
                spinner.setAdapter(iqv);
                spinner.setSelection(i4);
                this.ac.addView(linearLayout2);
                i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? View.generateViewId() : R.id.spinner_3 : R.id.spinner_2 : R.id.spinner_1 : R.id.spinner_0;
                spinner.setId(i2);
                i2 = i + 1;
                spinner.setTag(Integer.valueOf(i));
                this.ae.add(spinner);
            }
            i = i2;
            viewGroup2 = null;
        }
        inflate.findViewById(R.id.apply).setOnClickListener(new iqo(this));
        inflate.findViewById(R.id.cancel).setOnClickListener(new iqr(this));
        return inflate;
    }

    private final void X() {
        this.Z = W();
        dismiss();
        a(this.v, "FilterDialogFragment");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (u()) {
            X();
        } else {
            this.ab = true;
        }
    }

    public final void B() {
        super.B();
        if (this.ab) {
            nf U_ = U_();
            if (U_ instanceof irr) {
                dismiss();
                iqp.a((irr) U_, W());
            } else {
                X();
            }
        }
        this.ab = false;
    }

    public final axny W() {
        int intValue;
        axnt axnt;
        int a;
        ArrayList arrayList = new ArrayList(this.aa.a);
        Iterator it = this.ae.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Spinner spinner = (Spinner) it.next();
            intValue = ((Integer) spinner.getTag()).intValue();
            int selectedItemPosition = spinner.getSelectedItemPosition();
            axnt = (axnt) ((anxo) ((axnu) arrayList.get(intValue)).toBuilder());
            for (int i = 0; i < axnt.a(); i++) {
                axnv axnv;
                if (i != selectedItemPosition) {
                    a = axoa.a(axnt.a(i).c);
                    if (a != 0 && a == 3) {
                        axnv = (axnv) ((anxo) axnt.a(i).toBuilder());
                        axnv.a(2);
                        axnt.a(i, axnv);
                    }
                } else {
                    axnv = (axnv) ((anxo) axnt.a(i).toBuilder());
                    axnv.a(3);
                    axnt.a(i, axnv);
                }
            }
            arrayList.set(intValue, (axnu) ((anxl) axnt.build()));
        }
        for (ChipCloudView chipCloudView : this.af) {
            intValue = ((Integer) chipCloudView.getTag()).intValue();
            axnt = (axnt) ((anxo) ((axnu) arrayList.get(intValue)).toBuilder());
            for (a = 0; a < axnt.a(); a++) {
                if (chipCloudView.getChildAt(a).getVisibility() != 8) {
                    axnv axnv2;
                    if (((fej) chipCloudView.getChildAt(a)).m != 1) {
                        int a2 = axoa.a(axnt.a(a).c);
                        if (a2 != 0 && a2 == 3) {
                            axnv2 = (axnv) ((anxo) axnt.a(a).toBuilder());
                            axnv2.a(2);
                            axnt.a(a, axnv2);
                        }
                    } else {
                        axnv2 = (axnv) ((anxo) axnt.a(a).toBuilder());
                        axnv2.a(3);
                        axnt.a(a, axnv2);
                    }
                }
            }
            arrayList.set(intValue, (axnu) ((anxl) axnt.build()));
        }
        axnx axnx = (axnx) axny.b.createBuilder();
        axnx.copyOnWrite();
        axny axny = (axny) axnx.instance;
        axny.a();
        anvf.addAll(arrayList, axny.a);
        return (axny) ((anxl) axnx.build());
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("innertube_search_filters", aobp.a(W()));
    }
}
