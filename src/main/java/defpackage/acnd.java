package defpackage;

import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: acnd */
final /* synthetic */ class acnd implements acav {
    private final acnc a;

    acnd(acnc acnc) {
        this.a = acnc;
    }

    public final void a(int i) {
        int i2 = i;
        acnc acnc = this.a;
        StringBuilder stringBuilder;
        if (i2 == 0) {
            acnc.aZ = false;
            if (acnc.bb) {
                acnc.ai();
                acnc.aU = acnc.ad.b();
                acnc.aW = acnc.ad.b();
                acnc.aV = acnc.ad.b();
                acnc.aX = acnc.ad.b();
                acnc.aT = acnc.ad.b();
                acnc.aY = new acng(acnc);
                acan acan = acnc.ad;
                acao acao = acnc.aY;
                if (acao != null) {
                    acan.a.put(acao, new acam(acan, acao));
                }
                acon acon = new acon(acnc);
                acck acck = acnc.ae;
                acck.j = acon;
                int i3 = 1;
                amqw.b(acck.i ^ 1, (Object) "Health monitor must be stopped");
                acck.k = 500;
                acck.i = true;
                acck.l = acck.b.c() + TimeUnit.SECONDS.toMillis(45);
                acck.m = acck.b.c() + TimeUnit.SECONDS.toMillis(60);
                acck.a.post(acck.e);
                acck.a.postDelayed(acck.d, (long) acck.k);
                acop acop = new acop(acnc);
                aceh aceh = acnc.af;
                aceh.d = acop;
                if (aceh.e) {
                    Log.w("CaptureRsrcMonitor", "Resource monitor already running.");
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                    String str = "android.intent.category.DEFAULT";
                    intentFilter.addCategory(str);
                    aceh.b.registerReceiver(aceh.n, intentFilter);
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addCategory(str);
                    aceh.b.registerReceiver(aceh.o, intentFilter);
                    acef.a().a(auhp.class, acby.class, aceh);
                    aceh.e = true;
                }
                acnc.aw.setEnabled(acnc.aQ);
                acnc.ax.setEnabled(acnc.aQ);
                acnc.ag.G();
                acnc.al();
                acsa acsa = acnc.az;
                if (!(acsa == null || acsa.a.a.size() == 0)) {
                    if (acsa.e.getChildCount() <= 0) {
                        int i4 = 0;
                        for (avbu avbu : acsa.a.a) {
                            if (!(avbu == null || (avbu.a & i3) == 0)) {
                                boolean a;
                                avbs avbs = avbu.b;
                                if (avbs == null) {
                                    avbs = avbs.e;
                                }
                                avbs avbs2 = avbs;
                                int dimension = (int) acsa.e.getResources().getDimension(R.dimen.lc_24dp_image_button_container_size);
                                acrv acrv = r10;
                                acrv acrv2 = new acrv(acsa.c, acsa.b, avbs2, acsa.f, acsa.d, acsa.g, dimension, dimension);
                                ViewGroup viewGroup = acrv.d;
                                acsa.e.addView(viewGroup);
                                LayoutParams layoutParams = new LayoutParams(-2, -2);
                                int dimension2 = (int) acsa.e.getResources().getDimension(R.dimen.lc_24dp_image_button_margin);
                                layoutParams.setMargins(dimension2, dimension2, dimension2, dimension2);
                                viewGroup.setLayoutParams(layoutParams);
                                avbo avbo = acrv.a.c;
                                if (avbo == null) {
                                    avbo = avbo.c;
                                }
                                if (avbo.a != 142774990) {
                                    a = acrv.a(acrv.b);
                                } else {
                                    a = acrv.c.ad();
                                }
                                if (a) {
                                    acrv.d.setVisibility(0);
                                    acrv.e.a(acrv.f, null);
                                    i4++;
                                }
                            }
                            i3 = 1;
                        }
                        i4--;
                        acsa.e.setWeightSum((float) i4);
                        i3 = 0;
                        for (int i5 = 0; i5 < acsa.e.getChildCount(); i5++) {
                            View childAt = acsa.e.getChildAt(i5);
                            if (childAt.getVisibility() == 0) {
                                ((LayoutParams) childAt.getLayoutParams()).weight = (float) (i3 != i4 ? 1 : 0);
                                i3++;
                            }
                        }
                    }
                    acsa.e.setVisibility(0);
                }
                acnc.ar.setAlpha(1.0f);
                acnc.Z.a(acnc.ay, null);
                acnc.aC.setVisibility(8);
                if (acnc.bb) {
                    long elapsedRealtime;
                    if (acnc.aO == 0) {
                        xvf xvf = new xvf();
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        acnc.aO = elapsedRealtime;
                        acnc.ag.a(elapsedRealtime);
                    }
                    StreamStatusView streamStatusView = acnc.av;
                    elapsedRealtime = acnc.aO;
                    streamStatusView.a.stop();
                    streamStatusView.a.setBase(elapsedRealtime);
                    streamStatusView = acnc.av;
                    streamStatusView.a.setBase(acnc.aO);
                    streamStatusView.a.start();
                }
                acnc.am();
                acef.a().a(auhl.class, acnc.b);
            }
        } else if (i2 == 2 || i2 == 7 || i2 == 8) {
            stringBuilder = new StringBuilder(54);
            stringBuilder.append("Capture pipeline not configured properly - ");
            stringBuilder.append(i2);
            xtl.c(stringBuilder.toString());
            acnc.aa.c();
        } else {
            stringBuilder = new StringBuilder(35);
            stringBuilder.append("Error starting capture: ");
            stringBuilder.append(i2);
            xtl.c(stringBuilder.toString());
            acnc.f(i2);
        }
    }
}
