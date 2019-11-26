package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrefilledFormCompanionExtensionRendererOuterClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jrx */
public final class jrx implements vdc, vdd {
    public final aaas a;
    public final vod b;
    public aqeb c;
    public vqx d;
    private final akkq e;
    private final acvx f;
    private final epj g;
    private boolean h;
    private final jse i;
    private final jsc j;
    private View k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private eph r;
    private View s;
    private View t;
    private epn u;

    public jrx(akkq akkq, aaas aaas, acvx acvx, vod vod, jse jse, jsc jsc, epj epj) {
        this.e = akkq;
        this.a = aaas;
        this.f = acvx;
        this.b = vod;
        this.i = jse;
        this.j = jsc;
        this.g = (epj) amqw.a((Object) epj);
    }

    public final void a(View view, akor akor) {
        if (this.c != null) {
            aqec aqec;
            anxp anxp;
            anxr access$000;
            Object b;
            Object b2;
            auvn auvn;
            aqlj aqlj;
            View view2 = this.k;
            if (view2 == null || view2.getParent() != view) {
                b(view);
                this.k = xpr.a(view, (int) R.id.compact_companion_card_stub, (int) R.id.compact_companion_card);
                this.l = (ImageView) this.k.findViewById(R.id.thumbnail);
                this.m = (TextView) this.k.findViewById(R.id.heading_text);
                this.n = (TextView) this.k.findViewById(R.id.heading_ad_badge);
                this.o = (TextView) this.k.findViewById(R.id.subheading_text);
                this.p = (TextView) this.k.findViewById(R.id.subheading_ad_badge);
                this.q = (ImageView) this.k.findViewById(R.id.contextual_menu_anchor);
                this.t = this.k.findViewById(R.id.action_button);
                this.s = this.k.findViewById(R.id.secondary_button);
            }
            akkq akkq = this.e;
            ImageView imageView = this.l;
            aygk aygk = this.c.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
            TextView textView = this.m;
            TextView textView2 = this.n;
            aqeb aqeb = this.c;
            if ((aqeb.a & 2) != 0) {
                aqec = aqeb.c;
                if (aqec == null) {
                    aqec = aqec.d;
                }
            } else {
                aqec = null;
            }
            jrx.a(textView, textView2, aqec);
            textView = this.o;
            textView2 = this.p;
            aqeb = this.c;
            if ((aqeb.a & 4) != 0) {
                aqec = aqeb.d;
                if (aqec == null) {
                    aqec = aqec.d;
                }
            } else {
                aqec = null;
            }
            jrx.a(textView, textView2, aqec);
            this.k.setBackgroundColor(this.c.g);
            this.r = this.g.a(new jrw(this), this.t);
            this.u = new epn(this.s, this.e, null);
            this.d = new vqx(this.k, (byte) 0);
            aqeb aqeb2 = this.c;
            if (!(aqeb2 == null || (aqeb2.a & 256) == 0)) {
                anxp = aqeb2.j;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                anxp.a(access$000);
                jse jse;
                View view3;
                anxr access$0002;
                if (anxp.h.a(access$000.d)) {
                    jse = this.i;
                    view3 = this.k;
                    access$0002 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    jse.a(view3, b);
                } else {
                    access$000 = anxl.checkIsLite(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer);
                    anxp.a(access$000);
                    if (anxp.h.a(access$000.d)) {
                        jse = this.i;
                        view3 = this.k;
                        access$0002 = anxl.checkIsLite(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer);
                        anxp.a(access$0002);
                        b = anxp.h.b(access$0002.d);
                        if (b == null) {
                            b = access$0002.b;
                        } else {
                            b = access$0002.a(b);
                        }
                        jse.a(view3, b);
                    } else {
                        this.i.a(this.k, null);
                    }
                }
            }
            anxp = this.c.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                eph eph = this.r;
                anxp anxp2 = this.c.e;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0003 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                anxp2.a(access$0003);
                b2 = anxp2.h.b(access$0003.d);
                if (b2 == null) {
                    b2 = access$0003.b;
                } else {
                    b2 = access$0003.a(b2);
                }
                eph.a((aohe) b2, this.f);
            } else {
                this.r.a();
            }
            anxp = this.c.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = this.c.f;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aokt aokt = (aokt) b;
                if ((aokt.a & 8) != 0) {
                    aaas aaas = this.a;
                    apxu apxu = aokt.e;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                    aokv aokv = (aokv) ((anxo) aokt.toBuilder());
                    aokv.copyOnWrite();
                    aokt aokt2 = (aokt) aokv.instance;
                    aokt2.e = null;
                    aokt2.a &= -9;
                    aokt = (aokt) ((anxl) aokv.build());
                    aqed aqed = (aqed) ((anxo) this.c.toBuilder());
                    anxl anxl = this.c.f;
                    if (anxl == null) {
                        anxl = axak.a;
                    }
                    axaj axaj = (axaj) ((anxo) anxl.toBuilder());
                    axaj.a(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer, aokt);
                    aqed.copyOnWrite();
                    aqeb aqeb3 = (aqeb) aqed.instance;
                    aqeb3.f = (axak) ((anxl) axaj.build());
                    aqeb3.a |= 16;
                    this.c = (aqeb) ((anxl) aqed.build());
                }
                this.u.a(new jrz(this));
                this.u.a(aokt, this.f);
            } else {
                this.u.a();
            }
            jsc jsc = this.j;
            View rootView = this.k.getRootView();
            ImageView imageView2 = this.q;
            anxp = this.c.h;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = this.c.h;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                auvn = (auvn) b;
            } else {
                auvn = null;
            }
            aqeb2 = this.c;
            if ((aqeb2.a & 2048) != 0) {
                aqlj aqlj2 = aqeb2.n;
                if (aqlj2 == null) {
                    aqlj2 = aqlj.d;
                }
                aqlj = aqlj2;
            } else {
                aqlj = null;
            }
            jsc.a(rootView, imageView2, auvn, aqlj, this.c, acvx.g);
            this.k.setOnClickListener(new jry(this));
            this.f.a(this.c.o.d(), null);
            aaas aaas2 = this.a;
            b2 = this.c;
            aabd.a(aaas2, b2.k, b2);
            aqed aqed2 = (aqed) ((anxo) this.c.toBuilder());
            aqed2.copyOnWrite();
            ((aqeb) aqed2.instance).k = anxl.emptyProtobufList();
            this.c = (aqeb) ((anxl) aqed2.build());
            c();
        }
    }

    public final void a() {
        this.h = true;
        c();
    }

    public final void b() {
        c();
    }

    public final void a(View view) {
        this.h = false;
        b(view);
        this.c = null;
    }

    private final void b(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.compact_companion_card_stub, (int) R.id.compact_companion_card).setVisibility(8);
        }
        aqeb aqeb = this.c;
        if (!(aqeb == null || (aqeb.a & 256) == 0)) {
            anxp anxp = aqeb.j;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
            anxp.a(access$000);
            jse jse;
            anxr access$0002;
            Object b;
            if (anxp.h.a(access$000.d)) {
                jse = this.i;
                access$0002 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                anxp.a(access$0002);
                b = anxp.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                jse.a(b);
            } else {
                access$000 = anxl.checkIsLite(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    jse = this.i;
                    access$0002 = anxl.checkIsLite(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    jse.a(b);
                } else {
                    this.i.a(null);
                }
            }
        }
        view = this.k;
        if (view != null) {
            view.setVisibility(8);
        }
        eph eph = this.r;
        if (eph != null) {
            eph.a();
        }
        epn epn = this.u;
        if (epn != null) {
            epn.a();
        }
        vqx vqx = this.d;
        if (vqx != null) {
            vqx.b();
        }
    }

    public final boolean a(ajzw ajzw, boolean z) {
        if (!a(ajzw)) {
            return false;
        }
        this.h = true;
        return true;
    }

    public final boolean a(ajzw ajzw) {
        aqeb aqeb = (aqeb) ajzv.a(ajzw, aqeb.class);
        if (aqeb == null) {
            return false;
        }
        this.c = aqeb;
        return true;
    }

    public final boolean a(aaga aaga, akcb akcb) {
        this.c = null;
        if (akcb == null) {
            return false;
        }
        ajtb ajtb = akcb.f;
        if (ajtb == null) {
            return false;
        }
        this.c = ajtb.d;
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final void a(Object obj, List list) {
        if (!this.b.a(obj)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
            aabd.a(this.a, list, hashMap);
        }
    }

    private static void a(TextView textView, View view, aqec aqec) {
        if (aqec == null) {
            textView.setText("");
            view.setVisibility(8);
            return;
        }
        arml arml = aqec.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        xpr.a(view, aqec.c);
    }

    private final void c() {
        if (this.h) {
            View view = this.k;
            if (view != null && this.c != null) {
                view.setVisibility(0);
            }
        }
    }

    public final int a(vow vow, boolean z) {
        aaas aaas = this.a;
        aqeb aqeb = this.c;
        apxu apxu = null;
        if (!(aqeb == null || (aqeb.a & 512) == 0)) {
            apxu = aqeb.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        jst.a(aaas, aqeb, apxu, this.u);
        vra vra = vow.b;
        aqeb aqeb2 = this.c;
        int i = 1;
        if (!(aqeb2 == null || (aqeb2.a & 1024) == 0)) {
            int a = aqhe.a(aqeb2.m);
            if (a != 0) {
                i = a;
            }
        }
        return jst.a(vra, z, i);
    }
}
