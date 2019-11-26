package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.util.HashMap;

/* renamed from: iik */
public final class iik {
    private static final kld f;
    public final ViewGroup a;
    public final View b;
    public kkk c;
    public kkk d;
    public kka e;
    private final acvx g;
    private final iih h;
    private final iio i;
    private final lux j;
    private final iji k;
    private final int l;
    private iim m;

    public iik(acvx acvx, lux lux, iji iji, iih iih, iio iio, zyw zyw, ViewGroup viewGroup, View view) {
        this.g = acvx;
        this.a = (ViewGroup) amqw.a((Object) viewGroup);
        this.b = (View) amqw.a((Object) view);
        this.h = iih;
        this.i = iio;
        this.j = lux;
        this.k = iji;
        boolean d = foh.d(zyw);
        this.l = !d ? R.layout.fullscreen_engagement_action_bar_button : R.layout.fullscreen_engagement_action_bar_button_performance;
        if (!d) {
            this.m = b();
            this.c = a();
            this.d = a();
            this.e = c();
        }
    }

    private final kkk a() {
        kkm kkm;
        iji iji = this.k;
        if (this.j.a() != 2) {
            kkm = (kkm) iji.a.get();
        } else {
            kkm = (kkm) iji.b.get();
        }
        ViewGroup viewGroup = this.a;
        return new kkk((aaas) kkm.a((aaas) kkm.a.get(), 1), (akvp) kkm.a((akvp) kkm.b.get(), 2), (Context) kkm.a((Context) kkm.c.get(), 3), (xci) kkm.a((xci) kkm.d.get(), 4), (aadw) kkm.a((aadw) kkm.e.get(), 5), (ViewGroup) kkm.a(viewGroup, 6), this.l, f);
    }

    private final iim b() {
        iio iio = this.i;
        iim iim = new iim((Context) iio.a((Context) iio.a.get(), 1), (acvx) iio.a((acvx) iio.b.get(), 2), (aaas) iio.a((aaas) iio.c.get(), 3), (akvp) iio.a((akvp) iio.d.get(), 4), (fmx) iio.a((fmx) iio.e.get(), 5), (akyz) iio.a((akyz) iio.f.get(), 6), (zyw) iio.a((zyw) iio.g.get(), 7), (ViewGroup) iio.a(this.a, 8));
        this.m = iim;
        return iim;
    }

    private final kka c() {
        kkc kkc;
        iji iji = this.k;
        if (this.j.a() != 2) {
            kkc = (kkc) iji.c.get();
        } else {
            kkc = (kkc) iji.d.get();
        }
        ViewGroup viewGroup = this.a;
        return new kka((aaas) kkc.a((aaas) kkc.a.get(), 1), (akvp) kkc.a((akvp) kkc.b.get(), 2), (Context) kkc.a((Context) kkc.c.get(), 3), (xci) kkc.a((xci) kkc.d.get(), 4), (kzb) kkc.a((kzb) kkc.e.get(), 5), (xhv) kkc.a((xhv) kkc.f.get(), 6), (SharedPreferences) kkc.a((SharedPreferences) kkc.g.get(), 7), (ViewGroup) kkc.a(viewGroup, 8), this.l, f);
    }

    public final void a(arnp arnp) {
        if (arnp != null && arnp.a.size() != 0) {
            for (axak axak : arnp.a) {
                anxr access$000 = anxl.checkIsLite(SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer);
                axak.a(access$000);
                arml arml = null;
                Object b;
                if (axak.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer);
                    axak.a(access$000);
                    b = axak.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    axpc axpc = (axpc) b;
                    iih iih = this.h;
                    iii iii = new iii((akvp) iih.a((akvp) iih.a.get(), 1), (fmx) iih.a((fmx) iih.b.get(), 2), (Context) iih.a((Context) iih.c.get(), 3), (akyz) iih.a((akyz) iih.d.get(), 4), (zyw) iih.a((zyw) iih.e.get(), 5), (ViewGroup) iih.a(this.a, 6));
                    iii.a(axpc, this.g, null);
                    this.a.addView(iii.a);
                } else {
                    access$000 = anxl.checkIsLite(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
                    axak.a(access$000);
                    if (axak.h.a(access$000.d)) {
                        Object obj;
                        access$000 = anxl.checkIsLite(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
                        axak.a(access$000);
                        Object b2 = axak.h.b(access$000.d);
                        if (b2 == null) {
                            obj = access$000.b;
                        } else {
                            obj = access$000.a(b2);
                        }
                        axpi axpi = (axpi) obj;
                        if (axpi.b) {
                            if (this.c == null) {
                                this.c = a();
                            }
                            this.c.a(axpi);
                            this.a.addView(this.c.b);
                        } else if (axpi.c) {
                            if (this.d == null) {
                                this.d = a();
                            }
                            this.d.a(axpi);
                            this.a.addView(this.d.b);
                        }
                    }
                    access$000 = anxl.checkIsLite(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer);
                    axak.a(access$000);
                    if (axak.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer);
                        axak.a(access$000);
                        b = axak.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        arnq arnq = (arnq) b;
                        if (this.m == null) {
                            this.m = b();
                        }
                        iim iim = this.m;
                        if ((1 & arnq.a) != 0) {
                            axak axak2 = arnq.b;
                            if (axak2 == null) {
                                axak2 = axak.a;
                            }
                            aphg aphg = (aphg) ajzv.a(ajzv.a(axak2), aphg.class);
                            if (aphg != null) {
                                int a;
                                HashMap hashMap = new HashMap();
                                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", iim);
                                iim.f.a(aphg, iim.g, hashMap);
                                iim.c.setOnLongClickListener(new iil(iim, arnq, hashMap));
                                if ((aphg.a & 16) != 0) {
                                    akvp akvp = iim.a;
                                    arwf arwf = aphg.e;
                                    if (arwf == null) {
                                        arwf = arwf.c;
                                    }
                                    arwh a2 = arwh.a(arwf.b);
                                    if (a2 == null) {
                                        a2 = arwh.UNKNOWN;
                                    }
                                    a = akvp.a(a2);
                                } else {
                                    a = 0;
                                }
                                Drawable a3 = a != 0 ? ra.a(iim.b, a) : null;
                                if (a3 != null) {
                                    a3 = st.d(a3).mutate();
                                    st.a(a3, iim.j);
                                    iim.d.setImageDrawable(a3);
                                } else {
                                    iim.d.setImageResource(0);
                                }
                                TextView textView = iim.e;
                                if ((aphg.a & 128) != 0) {
                                    arml = aphg.g;
                                    if (arml == null) {
                                        arml = arml.f;
                                    }
                                }
                                textView.setText(ajqy.a(arml));
                                if (iim.i != null) {
                                    arup arup = aphg.k;
                                    if (arup == null) {
                                        arup = arup.c;
                                    }
                                    if (arup.a == 102716411) {
                                        aruh aruh;
                                        fmx fmx = iim.i;
                                        arup arup2 = aphg.k;
                                        if (arup2 == null) {
                                            arup2 = arup.c;
                                        }
                                        if (arup2.a == 102716411) {
                                            aruh = (aruh) arup2.b;
                                        } else {
                                            aruh = aruh.j;
                                        }
                                        fmx.a(aruh, iim.c, aphg, iim.g);
                                    }
                                }
                            }
                        }
                        this.a.addView(this.m.c);
                    } else {
                        access$000 = anxl.checkIsLite(SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer);
                        axak.a(access$000);
                        if (axak.h.a(access$000.d)) {
                            access$000 = anxl.checkIsLite(SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer);
                            axak.a(access$000);
                            b = axak.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            axpa axpa = (axpa) b;
                            if (this.e == null) {
                                this.e = c();
                            }
                            this.e.a(axpa);
                            this.a.addView(this.e.b);
                        }
                    }
                }
            }
        }
    }

    static arnp a(arnu arnu) {
        if (arnu != null) {
            anxp anxp = arnu.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = arnu.f;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (arnp) b;
            }
        }
        return null;
    }

    static {
        jxo jxo = new jxo();
        Integer valueOf = Integer.valueOf(R.attr.fullscreenEngagementActionBarToggleButtonColor);
        jxo.a = valueOf;
        Integer valueOf2 = Integer.valueOf(R.attr.fullscreenEngagementActionBarToggleButtonSelectedColor);
        jxo.b = valueOf2;
        jxo.c = valueOf;
        jxo.d = valueOf2;
        String str = "";
        if (jxo.a == null) {
            str = str.concat(" defaultIconColorRes");
        }
        if (jxo.b == null) {
            str = String.valueOf(str).concat(" selectedIconColorRes");
        }
        if (jxo.c == null) {
            str = String.valueOf(str).concat(" defaultTextColorRes");
        }
        if (jxo.d == null) {
            str = String.valueOf(str).concat(" selectedTextColorRes");
        }
        if (str.isEmpty()) {
            f = new jxp(jxo.a.intValue(), jxo.b.intValue(), jxo.c.intValue(), jxo.d.intValue());
        } else {
            String str2 = "Missing required properties:";
            throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }
}
