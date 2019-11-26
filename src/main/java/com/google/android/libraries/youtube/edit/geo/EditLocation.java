package com.google.android.libraries.youtube.edit.geo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddPlaceEndpointOuterClass$AddPlaceEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.ajqy;
import defpackage.akyy;
import defpackage.akzb;
import defpackage.amqq;
import defpackage.amqw;
import defpackage.anxl;
import defpackage.anxp;
import defpackage.anxr;
import defpackage.aodv;
import defpackage.aphg;
import defpackage.apxu;
import defpackage.arml;
import defpackage.auka;
import defpackage.avas;
import defpackage.axak;
import defpackage.xse;
import defpackage.xtl;
import defpackage.zeh;
import defpackage.zqj;
import defpackage.zqk;
import defpackage.zql;
import defpackage.zrb;
import java.util.IdentityHashMap;

public class EditLocation extends LinearLayout implements OnClickListener {
    public acvx a;
    public akzb b;
    public zrb c;
    private final Drawable d;
    private final Drawable e;
    private final ViewGroup f;
    private final TextView g;
    private final ImageButton h;
    private final TextView i;
    private final TextView j;
    private final IdentityHashMap k = new IdentityHashMap();
    private zqj l;
    private auka m;
    private boolean n;
    private aphg o;
    private aphg p;
    private zrb q;

    public EditLocation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zeh.a, 0, 0);
        try {
            this.d = obtainStyledAttributes.getDrawable(1);
            this.e = obtainStyledAttributes.getDrawable(2);
            setOrientation(1);
            inflate(context, R.layout.edit_location_view, this);
            ((zql) xse.b(context)).a(this);
            this.g = (TextView) findViewById(R.id.location_setting_text);
            this.g.setOnClickListener(this);
            this.f = (ViewGroup) findViewById(R.id.place_suggestions);
            this.h = (ImageButton) findViewById(R.id.location_action_icon);
            this.h.setOnClickListener(this);
            this.i = (TextView) findViewById(R.id.location_search_notice);
            this.j = (TextView) findViewById(R.id.learn_more_button);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        zqk zqk = new zqk(super.onSaveInstanceState());
        zqk.a = this.c;
        zqk.b = this.m;
        return zqk;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof zqk) {
            zqk zqk = (zqk) parcelable;
            super.onRestoreInstanceState(zqk.getSuperState());
            auka auka = zqk.b;
            if (auka != null) {
                a(auka);
                a(zqk.a);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final void a(zqj zqj) {
        this.l = (zqj) amqw.a((Object) zqj);
    }

    public final void a(auka auka) {
        anxp anxp;
        anxr access$000;
        Object b;
        this.m = auka;
        if ((auka.a & 8) != 0) {
            anxp = this.m.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.p = (aphg) b;
        }
        if ((auka.a & 16) != 0) {
            anxp = this.m.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.o = (aphg) b;
        }
        this.f.removeAllViews();
        arml arml = null;
        if (auka.f.size() > 0) {
            this.f.setVisibility(0);
            LayoutInflater from = LayoutInflater.from(getContext());
            for (axak axak : auka.f) {
                anxr access$0002 = anxl.checkIsLite(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                axak.a(access$0002);
                if (axak.h.a(access$0002.d)) {
                    access$0002 = anxl.checkIsLite(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                    axak.a(access$0002);
                    Object b2 = axak.h.b(access$0002.d);
                    if (b2 == null) {
                        b2 = access$0002.b;
                    } else {
                        b2 = access$0002.a(b2);
                    }
                    avas avas = (avas) b2;
                    if ((avas.a & 2) != 0) {
                        Button button = (Button) from.inflate(R.layout.edit_location_suggestion, null);
                        this.f.addView(button);
                        arml arml2 = avas.c;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                        button.setText(ajqy.a(arml2));
                        b2 = avas.e;
                        if (b2 == null) {
                            b2 = apxu.d;
                        }
                        button.setTag(b2);
                        button.setOnClickListener(this);
                    } else {
                        String valueOf = String.valueOf(avas.b);
                        String str = "Empty place received: ";
                        xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                    }
                }
            }
        }
        if ((auka.a & 32) != 0) {
            arml = auka.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        Spanned a = ajqy.a(arml);
        if (!TextUtils.isEmpty(a)) {
            this.i.setText(a);
            this.i.setVisibility(0);
        }
        if ((auka.a & 64) != 0) {
            akyy a2 = this.b.a(this.j);
            anxp anxp2 = auka.h;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$0003);
            Object b3 = anxp2.h.b(access$0003.d);
            if (b3 == null) {
                b3 = access$0003.b;
            } else {
                b3 = access$0003.a(b3);
            }
            a2.a((aphg) b3, this.a);
        }
        int a3 = amqq.a(this.c, this.q) ^ 1;
        if ((auka.a & 4) != 0) {
            anxp anxp3 = this.m.c;
            if (anxp3 == null) {
                anxp3 = axak.a;
            }
            access$000 = anxl.checkIsLite(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
            anxp3.a(access$000);
            Object b4 = anxp3.h.b(access$000.d);
            if (b4 == null) {
                b4 = access$000.b;
            } else {
                b4 = access$000.a(b4);
            }
            avas avas2 = (avas) b4;
            if (!(avas2 == null || (avas2.a & 2) == 0)) {
                String str2 = avas2.b;
                arml arml3 = avas2.c;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
                this.q = new zrb(str2, ajqy.a(arml3).toString());
            }
        }
        if (a3 != 0) {
            a(this.c);
        } else {
            a(this.q);
        }
    }

    public final void a(zrb zrb) {
        if (zrb != null) {
            this.c = zrb;
            this.g.setText(zrb.b);
            a(this.p, this.e);
            this.n = true;
            this.f.setVisibility(8);
            return;
        }
        b();
    }

    private final void b() {
        this.c = null;
        auka auka = this.m;
        if ((auka.a & 2) != 0) {
            TextView textView = this.g;
            arml arml = auka.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        a(this.o, this.d);
        this.n = false;
        this.f.setVisibility(0);
    }

    public final boolean a() {
        return amqq.a(this.c, this.q) ^ 1;
    }

    private final void a(aphg aphg, Drawable drawable) {
        if (aphg != null) {
            this.h.setImageDrawable(drawable);
            if ((aphg.a & 16384) != 0) {
                ImageButton imageButton = this.h;
                aodv aodv = aphg.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                imageButton.setContentDescription(aodv.b);
            }
            Boolean bool = (Boolean) this.k.get(aphg);
            if (bool == null || !bool.booleanValue()) {
                this.a.a(aphg.r.d(), null);
                this.k.put(aphg, Boolean.valueOf(true));
            }
        }
    }

    public final void onClick(View view) {
        if (view == this.h) {
            if (this.n) {
                b();
            } else {
                this.l.bo_();
            }
        } else if (view == this.g) {
            this.l.bo_();
        } else {
            Object tag = view.getTag();
            if (tag instanceof apxu) {
                apxu apxu = (apxu) tag;
                arml arml = null;
                if ((apxu.a & 1) != 0) {
                    this.a.a(3, new acvs(apxu.b), null);
                }
                anxr access$000 = anxl.checkIsLite(AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint);
                    apxu.a(access$000);
                    tag = apxu.h.b(access$000.d);
                    if (tag == null) {
                        tag = access$000.b;
                    } else {
                        tag = access$000.a(tag);
                    }
                    AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint = (AddPlaceEndpointOuterClass$AddPlaceEndpoint) tag;
                    String str = addPlaceEndpointOuterClass$AddPlaceEndpoint.b;
                    if ((addPlaceEndpointOuterClass$AddPlaceEndpoint.a & 2) != 0) {
                        arml = addPlaceEndpointOuterClass$AddPlaceEndpoint.c;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    a(new zrb(str, ajqy.a(arml).toString()));
                    return;
                }
                xtl.c("AddPlaceEndpoint not returned for place suggestion.");
            }
        }
    }
}
