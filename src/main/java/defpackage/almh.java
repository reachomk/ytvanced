package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: almh */
public final class almh implements akot, alme, OnClickListener, OnLongClickListener {
    public final PopupWindow a;
    private final LayoutInflater b;
    private final RecyclerView c = ((RecyclerView) this.b.inflate(R.layout.connection_section, null));
    private final ImageView d = ((ImageView) this.b.inflate(R.layout.connection_section_dismiss_button, null));
    private final akoh e;
    private final alpc f;
    private final aaas g;
    private final almi h;
    private final allh i;
    private final acvx j;

    public almh(Context context, akkq akkq, aaas aaas, akvp akvp, almi almi, allh allh, acvx acvx, akpe akpe) {
        Context context2 = context;
        allh allh2 = allh;
        acvx acvx2 = acvx;
        Resources resources = context.getResources();
        this.b = LayoutInflater.from(context);
        this.d.measure(0, 0);
        this.d.setOnClickListener(this);
        this.d.setColorFilter(resources.getColor(R.color.quantum_googred500), Mode.MULTIPLY);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.share_panel_connection_section_spacing);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.share_panel_list_spacing);
        this.e = new akoh();
        this.f = new alpc(dimensionPixelSize, dimensionPixelSize2);
        ImageView imageView = this.d;
        this.a = new PopupWindow(imageView, imageView.getMeasuredWidth(), this.d.getMeasuredHeight());
        this.a.setBackgroundDrawable(new ColorDrawable());
        this.a.setOutsideTouchable(true);
        this.a.setTouchable(true);
        this.a.setFocusable(true);
        aknw aknw = new aknw();
        Context context3 = context;
        akkq akkq2 = akkq;
        allh allh3 = allh;
        acvx acvx3 = acvx;
        aknw.a(aqju.class, new almm(context3, akkq2, this, this, allh3, acvx3));
        aknw.a(aqkc.class, new alor(context3, akkq2, this, this, allh3, acvx3));
        aknw.a(aqka.class, new alok(context2, akkq2, allh2, acvx2));
        aknw.a(aatd.class, new almf(context2, this, allh2, acvx2));
        aknw.a(aykj.class, new allt(context2, akvp, aaas, acvx2));
        apa a = akpe.a(aknw);
        a.a(this.e);
        this.c.a(new ans(0, false));
        this.c.a(this.f);
        this.c.a(a);
        this.g = (aaas) amqw.a((Object) aaas);
        this.h = (almi) amqw.a((Object) almi);
        this.i = (allh) amqw.a((Object) allh);
        this.j = (acvx) amqw.a((Object) acvx);
        alpf.a(this.c, true);
        this.h.a(this.f);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final void onClick(View view) {
        View view2 = this.d;
        Object tag;
        if (view == view2) {
            tag = view2.getTag();
            if (alpt.c(tag) != null) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new alml(this.e, tag));
                this.g.a(alpt.c(tag), hashMap);
                this.a.dismiss();
                this.h.a(tag);
            }
            return;
        }
        tag = view.getTag();
        if (alpt.e(tag) && !this.i.c()) {
            this.i.a(alpt.a(tag), this.i.b(alpt.a(tag)) ^ 1);
        }
    }

    public final boolean onLongClick(View view) {
        Object tag = view.getTag();
        if (!alpt.e(tag) || !(tag instanceof aqkc)) {
            return false;
        }
        this.d.setTag(tag);
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        int[] iArr = new int[]{0, 0};
        view.getLocationInWindow(iArr);
        Point point = new Point(iArr[0] + ((view.getWidth() - width) / 2), iArr[1] - height);
        this.a.showAtLocation(view, 0, point.x, point.y);
        view.getViewTreeObserver().addOnScrollChangedListener(new almg(this, view));
        return true;
    }

    public final void a(aatd aatd) {
        this.h.a(aatd);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        Object obj2;
        aata aata = (aata) obj;
        alpc alpc = this.f;
        alpc.b.clear();
        alpc.c = 0;
        this.e.a();
        Iterator it = aata.a().iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            CharSequence a;
            Object next = it.next();
            aknh akpk = new akpk();
            arml arml;
            if (next instanceof aqjo) {
                aqjo aqjo = (aqjo) next;
                if ((aqjo.a & 1) != 0) {
                    arml = aqjo.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a = ajqy.a(arml);
                List<Object> a2 = aatc.a(aqjo);
                akpk.addAll(a2);
                for (Object d : a2) {
                    this.j.a(alpt.d(d));
                }
            } else if (next instanceof aqjy) {
                aqjy aqjy = (aqjy) next;
                if ((aqjy.a & 1) != 0) {
                    arml = aqjy.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a = ajqy.a(arml);
                if (aqjy.c.size() != 0) {
                    for (aqjw aqjw : aqjy.c) {
                        int i = aqjw.a;
                        Object obj3;
                        acvx acvx;
                        if ((i & 1) != 0) {
                            obj3 = aqjw.b;
                            if (obj3 == null) {
                                obj3 = aqju.g;
                            }
                            akpk.add(obj3);
                            acvx = this.j;
                            aqju aqju = aqjw.b;
                            if (aqju == null) {
                                aqju = aqju.g;
                            }
                            acvx.a(aqju.f.d());
                        } else if ((i & 2) != 0) {
                            obj3 = aqjw.c;
                            if (obj3 == null) {
                                obj3 = aqka.h;
                            }
                            akpk.add(obj3);
                            acvx = this.j;
                            aqka aqka = aqjw.c;
                            if (aqka == null) {
                                aqka = aqka.h;
                            }
                            acvx.a(aqka.g.d());
                        }
                    }
                }
            }
            this.e.a(akpk);
            if (!TextUtils.isEmpty(a)) {
                TextView textView = (TextView) this.b.inflate(R.layout.connection_section_title, this.c, false);
                textView.setText(a);
                alpc alpc2 = this.f;
                int e = this.e.e(akpk);
                textView.measure(0, 0);
                alpc2.b.put(e, textView);
                alpc2.c = Math.max(alpc2.c, textView.getMeasuredHeight());
            }
        }
        aatd b = aata.b();
        if (b != null) {
            aknh akpk2 = new akpk();
            akpk2.add(b);
            this.e.a(akpk2);
            this.j.a(b.a.c);
        }
        aykk aykk = aata.a.i;
        if (aykk != null && aykk.a == 114567947) {
            obj2 = (aykj) aykk.b;
        }
        if (obj2 != null) {
            aknh akpk3 = new akpk();
            akpk3.add(obj2);
            this.e.a(akpk3);
            this.j.a(obj2.e.d());
        }
    }
}
