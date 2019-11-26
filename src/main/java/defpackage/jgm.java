package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;

/* renamed from: jgm */
public final class jgm implements xcp {
    public final xci a;
    private final Activity b;
    private final akvp c;
    private final aaas d;
    private final acvx e;
    private aeh f;

    public jgm(Activity activity, akvp akvp, aaas aaas, acxj acxj, xci xci) {
        this.b = (Activity) amqw.a((Object) activity);
        this.c = (akvp) amqw.a((Object) akvp);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (acvx) amqw.a((Object) acxj);
        this.a = xci;
    }

    public final void a(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        obj = (CreationEntryEndpointOuterClass$CreationEntryEndpoint) obj;
        amqw.a(obj);
        aeh aeh = this.f;
        if (aeh == null || !aeh.isShowing()) {
            this.e.a(acwl.K, apxu, null);
            View inflate = this.b.getLayoutInflater().inflate(R.layout.creation_entry_sheet, null, false);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.creation_entry_point_items);
            apib apib = obj.b;
            if (apib == null) {
                apib = apib.c;
            }
            amqw.b((apib.a & 1) != 0);
            apib = obj.b;
            if (apib == null) {
                apib = apib.c;
            }
            aphz aphz = apib.b;
            if (aphz == null) {
                aphz = aphz.d;
            }
            if ((aphz.a & 1) != 0) {
                TextView textView = (TextView) inflate.findViewById(R.id.creation_sheet_title);
                apib apib2 = obj.b;
                if (apib2 == null) {
                    apib2 = apib.c;
                }
                aphz aphz2 = apib2.b;
                if (aphz2 == null) {
                    aphz2 = aphz.d;
                }
                arml arml = aphz2.c;
                if (arml == null) {
                    arml = arml.f;
                }
                textView.setText(ajqy.a(arml));
            }
            apib apib3 = obj.b;
            if (apib3 == null) {
                apib3 = apib.c;
            }
            aphz aphz3 = apib3.b;
            if (aphz3 == null) {
                aphz3 = aphz.d;
            }
            for (aphx aphx : aphz3.b) {
                arml arml2;
                aphg aphg = aphx.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                View inflate2 = this.b.getLayoutInflater().inflate(R.layout.creation_entry_item, linearLayout, false);
                TextView textView2 = (TextView) inflate2.findViewById(R.id.text);
                if ((aphg.a & 128) != 0) {
                    arml2 = aphg.g;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                textView2.setText(ajqy.a(arml2));
                if ((aphg.a & 16) != 0) {
                    akvp akvp = this.c;
                    arwf arwf = aphg.e;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    ((ImageView) inflate2.findViewById(R.id.image)).setImageResource(akvp.a(a));
                }
                inflate2.setOnClickListener(new jgn(this, aphg));
                this.e.b(new acvs(aphg.r));
                linearLayout.addView(inflate2);
            }
            aeh aeh2 = this.f;
            if (aeh2 == null) {
                aeg aeg = new aeg(this.b, R.style.CreationEntryDialog);
                aeg.a(inflate);
                this.f = aeg.a();
                this.f.setOnShowListener(new jgl(this));
                this.f.setOnDismissListener(new jgo(this));
                this.f.show();
                Window window = this.f.getWindow();
                int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.creation_sheet_dialog_width);
                if (dimensionPixelSize <= 0) {
                    dimensionPixelSize = -1;
                }
                window.setLayout(dimensionPixelSize, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                return;
            }
            aeh2.a.b(inflate);
            this.f.show();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (!((xgg) obj).a) {
            aeh aeh = this.f;
            if (aeh != null && aeh.isShowing()) {
                this.f.dismiss();
                return null;
            }
        }
        return clsArr;
    }
}
