package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ybk */
public final class ybk extends fi implements OnItemClickListener, zav {
    public akkq Z;
    public zay aa;
    public xxa ab;
    public ViewSwitcher ac;
    public ViewGroup ad;
    private yeb ae;
    private xwv af;
    private ufi ag;
    private Object ah;

    public static ybk a(auvn auvn, String str, Object obj) {
        ybk ybk = new ybk();
        Bundle bundle = new Bundle();
        if (auvn != null) {
            aobp.a(bundle, "CONTEXT_MENU", (anze) auvn);
        }
        bundle.putString("CONTACT_PATH_KEY", str);
        ybk.f(bundle);
        ybk.ah = obj;
        ybk.w();
        return ybk;
    }

    public final void a(Activity activity) {
        Context context = activity;
        super.a(activity);
        ((ybl) ((xfc) context).n()).a(this);
        this.ae = new yeb(context, this.Z);
        this.ag = new ufi(context);
        xxa xxa = this.ab;
        ufi ufi = this.ag;
        yeb yeb = this.ae;
        zay zay = this.aa;
        this.af = new xwv((Context) xxa.a((Context) xxa.a.get(), 1), (aaas) xxa.a((aaas) xxa.b.get(), 2), (aarh) xxa.a((aarh) xxa.c.get(), 3), (akmx) xxa.a((akmx) xxa.d.get(), 4), (xoi) xxa.a((xoi) xxa.e.get(), 5), (zeb) xxa.a((zeb) xxa.f.get(), 6), (zea) xxa.a((zea) xxa.g.get(), 7), (acwa) xxa.a((acwa) xxa.h.get(), 8), (afve) xxa.a((afve) xxa.i.get(), 9), (zav) xxa.a(this, 10), (ArrayAdapter) xxa.a(ufi, 11), (yeb) xxa.a(yeb, 12), (alpa) xxa.a(zay, 13), xwe.a(context, R.attr.ytTextPrimary, 0));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(1, 0);
        bundle = this.j;
        String str = "CONTEXT_MENU";
        if (bundle.containsKey(str)) {
            try {
                this.af.a((auvn) aobp.a(bundle, str, auvn.l, anxa.c()), this.ah);
            } catch (anyg unused) {
                f();
                xtl.d("Conversation bottom sheet failed to merge MenuRenderer.");
            }
        }
        xwv xwv = this.af;
        String string = bundle.getString("CONTACT_PATH_KEY");
        Object obj = this.ah;
        if (!TextUtils.isEmpty(string)) {
            xwv.l = new Builder().path(string).build();
            xwv.m = obj;
            xwv.b();
            xwv.c();
        }
    }

    public final void B() {
        super.B();
        xwv xwv = this.af;
        xwv.a();
        if (!(xwv.e == null || xwv.l == null)) {
            zeg zeg = xwv.j;
            if (zeg != null) {
                xwv.c.a(zeg);
            }
            xwv.j = zeg.a(xwv, true, xwv.l, xwv.e);
            xwv.c.a(xwv.j, xwv);
        }
        xwv.c();
    }

    public final void ad_() {
        super.ad_();
        xwv xwv = this.af;
        zeg zeg = xwv.j;
        if (zeg != null) {
            xwv.c.a(zeg);
            xwv.j = null;
        }
    }

    public final void a(nn nnVar) {
        super.a(nnVar.f(), null);
    }

    public final void W() {
        f();
    }

    public final void a(auvn auvn) {
        this.af.a(auvn, this.ah);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
        viewGroup2.setBackgroundColor(xwe.a(viewGroup2.getContext(), R.attr.ytBrandBackgroundSolid, 0));
        ListView listView = (ListView) viewGroup2.findViewById(R.id.bottom_sheet_list_view);
        listView.setAdapter(this.ag);
        listView.setOnItemClickListener(this);
        listView.setPadding(0, q().getDimensionPixelSize(R.dimen.bottom_sheet_padding_top), 0, 0);
        this.ad = viewGroup2;
        this.ad.addOnLayoutChangeListener(new ybj(this));
        viewGroup2 = this.ad;
        View findViewById = viewGroup2.findViewById(R.id.bottom_sheet_title);
        if (findViewById != null) {
            viewGroup2.removeView(findViewById);
        }
        this.ad.addView(this.ae.a, 0);
        this.ac = (ViewSwitcher) layoutInflater.inflate(R.layout.conversation_bottom_sheet_fragment, viewGroup, false);
        this.ac.addView(this.ad);
        return this.ac;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        xwv xwv = this.af;
        try {
            auvn auvn = xwv.f;
            apxu apxu;
            if (auvn == null) {
                if (xwv.g != null) {
                    if (xwv.i != null) {
                        xwx xwx = (xwx) xwv.k.get(i);
                        arml arml = null;
                        if (xwx == xwx.CHANNEL_ITEM) {
                            aaas aaas = xwv.b;
                            apxu = xwv.g.m;
                            if (apxu == null) {
                                apxu = apxu.d;
                            }
                            aaas.a(apxu, null);
                        } else {
                            String str;
                            auuz a = xwx.a(xwv.i);
                            aqjm aqjm = xwv.g;
                            switch (xwx.ordinal()) {
                                case 1:
                                    str = aqjm.j;
                                    break;
                                case 2:
                                    str = aqjm.k;
                                    break;
                                case 3:
                                    str = aqjm.l;
                                    break;
                                case 4:
                                    str = aqjm.f;
                                    break;
                                case 5:
                                    str = aqjm.h;
                                    break;
                                case 6:
                                    str = aqjm.g;
                                    break;
                                case 7:
                                    str = aqjm.i;
                                    break;
                                case 8:
                                    str = aqjm.n;
                                    break;
                                default:
                                    throw new IllegalArgumentException(xwx.name());
                            }
                            if ((a.a & 8) == 0) {
                                xwv.a(xwx, str);
                            } else {
                                arml arml2;
                                if (xwv.h == null) {
                                    xwv.h = new xww();
                                }
                                AlertDialog.Builder builder = new AlertDialog.Builder(xwv.a);
                                xwy xwy = new xwy(xwv, xwx, str);
                                aqhr aqhr = a.e;
                                if (aqhr == null) {
                                    aqhr = aqhr.f;
                                }
                                aaas aaas2 = xwv.b;
                                if ((aqhr.a & 1) != 0) {
                                    arml2 = aqhr.b;
                                    if (arml2 == null) {
                                        arml2 = arml.f;
                                    }
                                } else {
                                    arml2 = null;
                                }
                                builder.setTitle(ajqy.a(arml2));
                                if ((aqhr.a & 2) != 0) {
                                    arml = aqhr.c;
                                    if (arml == null) {
                                        arml = arml.f;
                                    }
                                }
                                builder.setMessage(aabb.a(arml, aaas2, false));
                                if ((aqhr.a & 4) != 0) {
                                    arml arml3 = aqhr.d;
                                    if (arml3 == null) {
                                        arml3 = arml.f;
                                    }
                                    builder.setNegativeButton(ajqy.a(arml3), xwy);
                                }
                                if ((aqhr.a & 8) != 0) {
                                    arml arml4 = aqhr.e;
                                    if (arml4 == null) {
                                        arml4 = arml.f;
                                    }
                                    builder.setPositiveButton(ajqy.a(arml4), xwy);
                                }
                                AlertDialog create = builder.create();
                                create.show();
                                view = create.findViewById(16908299);
                                if (view instanceof TextView) {
                                    ((TextView) view).setMovementMethod(LinkMovementMethod.getInstance());
                                }
                            }
                        }
                    }
                }
            } else if (i >= 0 && i < auvn.b.size()) {
                auvj auvj = (auvj) xwv.f.b.get(i);
                apxu = abmk.d(auvj);
                String str2 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
                if (apxu != null) {
                    Map hashMap = new HashMap();
                    hashMap.put(str2, xwv.m);
                    xwv.b.a(apxu, hashMap);
                } else {
                    apxu c = abmk.c(auvj);
                    if (c != null) {
                        Map hashMap2 = new HashMap();
                        hashMap2.put(str2, xwv.m);
                        xwv.b.a(c, hashMap2);
                    }
                }
            }
            xwv.d.W();
        } catch (Throwable th) {
            xwv.d.W();
        }
    }

    public final void X() {
        ViewSwitcher viewSwitcher = this.ac;
        if (viewSwitcher != null && viewSwitcher.getCurrentView() != null && this.ac.getCurrentView().getId() == R.id.progress_spinner) {
            this.ac.showNext();
        }
    }
}
