package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
import com.google.protos.youtube.api.innertube.PhonebookRenderer;
import com.google.protos.youtube.api.innertube.TextMessageEndpointOuterClass$TextMessageEndpoint;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: alnf */
public final class alnf implements akot, alio, OnClickListener, xni {
    private static final long d = TimeUnit.SECONDS.toMillis(2);
    public final View a;
    public final int b;
    public boolean c;
    private final Context e;
    private final aaas f;
    private final akkq g;
    private final akvp h;
    private final alni i;
    private final ImageView j;
    private final ImageView k;
    private final CircularImageView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final allf r;
    private final Runnable s = new alnh(this);
    private apxu t;
    private apxu u;
    private alld v;

    public alnf(Context context, aaas aaas, akkq akkq, akvp akvp, allf allf, alni alni) {
        this.e = (Context) amqw.a((Object) context);
        this.f = (aaas) amqw.a((Object) aaas);
        this.g = (akkq) amqw.a((Object) akkq);
        this.h = (akvp) amqw.a((Object) akvp);
        this.r = (allf) amqw.a((Object) allf);
        this.i = (alni) amqw.a((Object) alni);
        this.a = LayoutInflater.from(context).inflate(R.layout.phone_contact_entry, null);
        this.b = xwe.a(context, R.attr.ytBrandBackgroundSolid, 0);
        this.j = (ImageView) this.a.findViewById(R.id.default_badge);
        this.k = (ImageView) this.a.findViewById(R.id.invite_button);
        this.l = (CircularImageView) this.a.findViewById(R.id.thumbnail);
        this.m = (TextView) this.a.findViewById(R.id.contact_name);
        this.n = (TextView) this.a.findViewById(R.id.phone_number);
        this.o = (TextView) this.a.findViewById(R.id.phone_type);
        this.p = (TextView) this.a.findViewById(R.id.phone_type_bullet);
        this.q = (TextView) this.a.findViewById(R.id.invited_label);
    }

    public final void b(ImageView imageView) {
    }

    public final void c(ImageView imageView) {
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.v = null;
        this.t = null;
        this.u = null;
        this.c = true;
        this.j.setVisibility(4);
        this.l.setVisibility(4);
        this.a.setOnClickListener(null);
        this.a.removeCallbacks(this.s);
        this.k.setVisibility(8);
        this.q.setText(null);
        this.q.setVisibility(8);
    }

    public final void onClick(View view) {
        anxr access$000;
        Object b;
        apxx apxx;
        this.i.a(this.v);
        apxu apxu = this.t;
        if (apxu != null) {
            access$000 = anxl.checkIsLite(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = this.t;
                access$000 = anxl.checkIsLite(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ayei ayei = (ayei) ((anxo) ((TextMessageEndpointOuterClass$TextMessageEndpoint) b).toBuilder());
                ayei.copyOnWrite();
                ((TextMessageEndpointOuterClass$TextMessageEndpoint) ayei.instance).c = anxl.emptyProtobufList();
                String str = this.v.b;
                ayei.copyOnWrite();
                TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = (TextMessageEndpointOuterClass$TextMessageEndpoint) ayei.instance;
                if (str != null) {
                    if (!textMessageEndpointOuterClass$TextMessageEndpoint.c.a()) {
                        textMessageEndpointOuterClass$TextMessageEndpoint.c = anxl.mutableCopy(textMessageEndpointOuterClass$TextMessageEndpoint.c);
                    }
                    textMessageEndpointOuterClass$TextMessageEndpoint.c.add(str);
                    apxx = (apxx) ((anxo) this.t.toBuilder());
                    apxx.a(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint, (TextMessageEndpointOuterClass$TextMessageEndpoint) ((anxl) ayei.build()));
                    this.t = (apxu) ((anxl) apxx.build());
                    allf allf = this.r;
                    alld alld = this.v;
                    long j = alld.a;
                    String str2 = alld.b;
                    str = alld.d;
                    allf.a.edit().putString("phonebook_last_sms_contact", allf.a(j, str2, str)).putLong("phonebook_last_sms_timestamp", System.currentTimeMillis()).apply();
                    this.f.a(this.t, null);
                } else {
                    throw new NullPointerException();
                }
            }
        }
        apxu = this.u;
        if (apxu != null) {
            access$000 = anxl.checkIsLite(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = this.u;
                access$000 = anxl.checkIsLite(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arax arax = (arax) ((anxo) ((EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint) b).toBuilder());
                arax.a(this.v.h.e);
                apxx = (apxx) ((anxo) this.u.toBuilder());
                apxx.a(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint, (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint) ((anxl) arax.build()));
                apxu = (apxu) ((anxl) apxx.build());
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.f.a(apxu, hashMap);
                this.k.setVisibility(8);
                this.q.setVisibility(0);
                avyh avyh = (avyh) ((anxo) this.v.h.toBuilder());
                avyh.copyOnWrite();
                avyi avyi = (avyi) avyh.instance;
                avyi.a |= 4;
                avyi.d = 2;
                this.v.h = (avyi) ((anxl) avyh.build());
            }
        }
    }

    public final void a(avyi avyi) {
        this.i.a(avyi);
        alld alld = this.v;
        if (alld != null && alld.b.equals(avyi.b)) {
            alld = this.v;
            if (alld.h.c == avyi.c) {
                alld.h = avyi;
                int a = aqiw.a(avyi.d);
                if (a == 0 || a != 3) {
                    this.k.setVisibility(0);
                    this.q.setVisibility(8);
                    return;
                }
                this.k.setVisibility(8);
                this.q.setVisibility(0);
            }
        }
    }

    public final void a() {
        this.j.setVisibility(4);
    }

    public final void a(ImageView imageView) {
        this.l.setVisibility(0);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        alld alld = (alld) obj;
        this.v = alld;
        this.m.setText(alld.c);
        this.n.setText(alld.b);
        xpr.a(this.o, alld.d);
        this.p.setVisibility(!TextUtils.isEmpty(alld.d) ? 0 : 8);
        avyy avyy = alld.f;
        if (avyy != null) {
            arml arml;
            int dimensionPixelSize;
            TextView textView = this.q;
            if ((avyy.a & 4) != 0) {
                arml = avyy.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            avyq avyq = avyy.c;
            if (avyq == null) {
                avyq = avyq.c;
            }
            if ((avyq.a & 1) != 0) {
                avyq = avyy.c;
                if (avyq == null) {
                    avyq = avyq.c;
                }
                avyo avyo = avyq.b;
                if (avyo == null) {
                    avyo = avyo.d;
                }
                if ((avyo.a & 1) != 0) {
                    ImageView imageView = this.j;
                    akvp akvp = this.h;
                    arwf arwf = avyo.b;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    imageView.setImageResource(akvp.a(a));
                    if (avyo.c.isEmpty()) {
                        this.j.setBackground(null);
                        this.j.setPadding(0, 0, 0, 0);
                    } else {
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(Color.parseColor(avyo.c));
                        this.j.setBackground(shapeDrawable);
                        dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.phonebook_default_icon_padding);
                        this.j.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    }
                    this.j.setVisibility(0);
                }
            }
            aphj aphj = avyy.b;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                apxu apxu;
                aphj = avyy.b;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 4096) != 0) {
                    apxu = aphg.m;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                } else {
                    apxu = null;
                }
                this.t = apxu;
                if ((aphg.a & 2048) != 0) {
                    apxu = aphg.l;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                } else {
                    apxu = null;
                }
                this.u = apxu;
                if ((aphg.a & 16) == 0) {
                    this.k.setVisibility(8);
                    this.a.setOnClickListener(this);
                } else {
                    akvp akvp2 = this.h;
                    arwf arwf2 = aphg.e;
                    if (arwf2 == null) {
                        arwf2 = arwf.c;
                    }
                    arwh a2 = arwh.a(arwf2.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    dimensionPixelSize = akvp2.a(a2);
                    if (dimensionPixelSize != 0) {
                        this.k.setImageResource(dimensionPixelSize);
                        this.k.setVisibility(0);
                        this.k.setOnClickListener(this);
                    }
                }
            } else if ((alld.f.a & 16) != 0) {
                this.k.setVisibility(8);
                this.a.setOnClickListener(this);
            }
            anxp anxp = avyy.g;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(PhonebookRenderer.phonebookBottomSheetMenuTemplateRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                this.a.setOnClickListener(new alne(this, alld, avyy));
            }
        }
        int a3 = aqiw.a(alld.h.d);
        if (a3 != 0 && a3 == 3) {
            this.k.setVisibility(8);
            this.q.setVisibility(0);
        }
        if (alld.g != null) {
            allf allf = this.r;
            long j = alld.a;
            String str = alld.b;
            String str2 = alld.d;
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = "phonebook_last_sms_contact";
            if (allf.a.contains(str3) && allf.a(j, str, str2).equals(allf.a.getString(str3, null))) {
                str = "phonebook_last_sms_timestamp";
                j = allf.a.getLong(str, 0);
                long convert = TimeUnit.MILLISECONDS.convert(allf.b, TimeUnit.SECONDS);
                allf.a.edit().remove(str3).remove(str).apply();
                if (currentTimeMillis - j < convert && !alld.f.e.isEmpty()) {
                    this.a.setBackgroundColor(Color.parseColor(alld.f.e));
                    this.a.postDelayed(this.s, d);
                    this.c = false;
                    new akle(this.g, this.l).a(alld.e, (xni) this);
                    this.i.a(alld.i);
                }
            }
        }
        this.a.setBackgroundColor(this.b);
        new akle(this.g, this.l).a(alld.e, (xni) this);
        this.i.a(alld.i);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(alld alld, avyy avyy) {
        alni alni = this.i;
        anxp anxp = avyy.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(PhonebookRenderer.phonebookBottomSheetMenuTemplateRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        alni.a(alld, (avym) b, this);
    }
}
