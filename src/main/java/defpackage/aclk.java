package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;

/* renamed from: aclk */
public final class aclk {
    public boolean a;
    public boolean b;
    public int c = 0;
    public boolean d;
    public int e;
    public boolean f;
    private final LiveCreationActivity g;
    private boolean h;
    private final Runnable i = new acln(this);

    public aclk(LiveCreationActivity liveCreationActivity) {
        this.g = liveCreationActivity;
        this.e = 1;
    }

    public final void a() {
        a(1);
    }

    public final void b() {
        this.a = true;
        e();
    }

    public final void c() {
        this.d = true;
        e();
    }

    public final void a(Bundle bundle) {
        this.e = bundle.getInt("stream_control_state");
        this.a = bundle.getBoolean("enablement_complete");
        this.b = bundle.getBoolean("thumbnail_chosen");
        this.d = bundle.getBoolean("live_stream_complete");
        this.f = false;
    }

    public final void d() {
        this.h = true;
        this.g.j.post(this.i);
    }

    private final void a(int i) {
        this.e = i;
        d();
    }

    public final void e() {
        int i = this.e;
        if (i == 1) {
            i = this.c;
            if (i == 4 || i == 5) {
                a(5);
            } else if (this.a) {
                a(2);
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                }
            } else if (this.d) {
                a(5);
            } else if (this.h) {
                Context context = this.g;
                if (TextUtils.isEmpty(context.J.c)) {
                    xtl.c("Trying to go live without the necessary state");
                    context.a(acmu.CUSTOM_MESSAGE, context.getString(R.string.lc_error_stream_setup_error));
                } else {
                    aclo aclo;
                    aceo aceo;
                    int i2;
                    if (TextUtils.isEmpty(context.J.p) || TextUtils.isEmpty(context.J.q)) {
                        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
                        int b = rn.b(context, "android.permission.RECORD_AUDIO");
                        aceo aceo2 = context.J;
                        hasSystemFeature = hasSystemFeature && b == 0;
                        aceo2.k = hasSystemFeature;
                    }
                    acgv acgv = context.J.d;
                    if (acgv != null) {
                        Boolean bool = acgv.f;
                        if (bool != null && bool.booleanValue()) {
                            if (!context.S) {
                                context.S = true;
                                if (VERSION.SDK_INT >= 23) {
                                    aclo = context.I;
                                    if (!aclo.a(context)) {
                                        String valueOf = String.valueOf(context.getPackageName());
                                        String str = "package:";
                                        if (valueOf.length() == 0) {
                                            valueOf = new String(str);
                                        } else {
                                            valueOf = str.concat(valueOf);
                                        }
                                        context.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(valueOf)), 1001);
                                    }
                                }
                                context.s();
                            }
                        }
                    }
                    if (context.N == null) {
                        boolean z;
                        aceo = context.J;
                        if (aceo.e) {
                            z = true;
                        } else {
                            aclo aclo2 = context.I;
                            z = false;
                        }
                        aceo.e = z;
                        context.N = acnc.a(aceo.c, aceo.s, aceo.k, context.T, aceo.l, aceo.p, aceo.q, aceo.h, aceo.j, context.z.h(), context.z.g(), context.z.b(), context.z.c(), z, context.z.j());
                        if (!z) {
                            aclo = context.I;
                        }
                    }
                    xoa xoa = context.L;
                    if (xoa != null) {
                        xoa.disable();
                    }
                    context.L = new xoa(context, context.getWindowManager(), context);
                    context.setRequestedOrientation(!context.J.l ? 6 : 7);
                    aceo aceo3 = context.J;
                    int i3 = aceo3.n;
                    if (i3 == 0 && aceo3.o == 0) {
                        Point point = new Point();
                        context.getWindowManager().getDefaultDisplay().getRealSize(point);
                        aceo = context.J;
                        int i4 = point.x;
                        aceo.n = i4;
                        aceo = context.J;
                        i2 = point.y;
                        aceo.o = i2;
                        i3 = i4;
                    } else {
                        i2 = aceo3.o;
                    }
                    LayoutParams layoutParams = context.Q.getLayoutParams();
                    if (layoutParams.height == -1 && layoutParams.width == -1) {
                        layoutParams.width = i3;
                        layoutParams.height = i2;
                    }
                    context.Q.setLayoutParams(layoutParams);
                    aceo3 = context.J;
                    i3 = aceo3.m;
                    if (i3 != -1) {
                        context.U.a(i3);
                    } else {
                        aceo3.m = context.getWindowManager().getDefaultDisplay().getRotation();
                    }
                    context.u();
                    context.a(context.N, "LIVE_STREAM_FRAGMENT", true);
                    context.M = null;
                    acef.a().e = context.J.c;
                    acef.a().j = !context.J.e ? 2 : 3;
                }
                this.h = false;
            }
        } else if (!TextUtils.isEmpty(this.g.J.c) && this.b) {
            a(3);
        }
    }
}
