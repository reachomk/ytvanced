package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.BitmapKeyHolderRegistry;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.SelectableItemRegistry;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: nit */
public final class nit implements xcp {
    public awfu a;
    public final nhv b;
    public final njc c;
    public final njb d;
    public final RemoteDataBus e;
    public final EmbedInteractionLoggerCoordinator f;
    private airi g;
    private ahkr h;
    private ngz i;
    private final bdfg j = bdfg.b(Boolean.valueOf(false));
    private final BitmapKeyHolderRegistry k;
    private final SelectableItemRegistry l;

    public nit(bctz bctz, EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator, mqy mqy, nhv nhv, BitmapKeyHolderRegistry bitmapKeyHolderRegistry, SelectableItemRegistry selectableItemRegistry, RemoteDataBus remoteDataBus) {
        this.f = embedInteractionLoggerCoordinator;
        this.b = nhv;
        this.k = bitmapKeyHolderRegistry;
        this.l = selectableItemRegistry;
        this.e = remoteDataBus;
        this.c = new njc();
        this.d = new njb(embedInteractionLoggerCoordinator, mqy);
        this.b.a((int) R.id.related_videos_screen_button, new niw(this));
        this.b.a((int) R.id.related_videos_screen_button, new niv(this));
        this.c.b = this.k.a(this.c);
        this.d.b = this.l.a(this.d);
        this.j.c().a(new niy(this));
        this.j.c().a(new bcxq(TimeUnit.MILLISECONDS, bdfe.a())).a(new nix(this));
        bctz.a(new nja(this), new niz(this));
    }

    public final void a(ngz ngz) {
        this.i = ngz;
        b();
    }

    private final void a() {
        this.e.a(nhf.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    private final void b() {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x0006:
        r0 = r0.b;
        r0 = r0.size();
        if (r0 > 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r0 = 1;
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        r3 = r9.g;
        if (r3 == 0) goto L_0x002a;
    L_0x0016:
        r4 = 2;
        r4 = new defpackage.airi[r4];
        r5 = defpackage.airi.VIDEO_PLAYING;
        r4[r2] = r5;
        r5 = defpackage.airi.ENDED;
        r4[r1] = r5;
        r3 = r3.a(r4);
        if (r3 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002a;
    L_0x0028:
        r3 = 1;
        goto L_0x002b;
    L_0x002a:
        r3 = 0;
    L_0x002b:
        r4 = r9.i;
        if (r4 == 0) goto L_0x0037;
    L_0x002f:
        r4 = r4.g;
        r5 = 4;
        if (r4 != r5) goto L_0x0035;
    L_0x0034:
        goto L_0x0037;
    L_0x0035:
        r4 = 1;
        goto L_0x0038;
    L_0x0037:
        r4 = 0;
    L_0x0038:
        r5 = r9.h;
        if (r5 == 0) goto L_0x0045;
    L_0x003c:
        r5 = r5.b();
        if (r5 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0045;
    L_0x0043:
        r5 = 1;
        goto L_0x0046;
    L_0x0045:
        r5 = 0;
    L_0x0046:
        r6 = r9.g;
        if (r6 == 0) goto L_0x0059;
    L_0x004a:
        r7 = new defpackage.airi[r1];
        r8 = defpackage.airi.ENDED;
        r7[r2] = r8;
        r6 = r6.a(r7);
        if (r6 != 0) goto L_0x0057;
    L_0x0056:
        goto L_0x0059;
    L_0x0057:
        r6 = 1;
        goto L_0x005a;
    L_0x0059:
        r6 = 0;
    L_0x005a:
        if (r0 != 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0067;
    L_0x005d:
        if (r3 == 0) goto L_0x0067;
    L_0x005f:
        if (r4 != 0) goto L_0x0067;
    L_0x0061:
        if (r5 != 0) goto L_0x0066;
    L_0x0063:
        if (r6 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0067;
    L_0x0066:
        r2 = 1;
    L_0x0067:
        r0 = r9.j;
        r1 = java.lang.Boolean.valueOf(r2);
        r0.e_(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nit.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    public final java.lang.Class[] a(java.lang.Class r4, java.lang.Object r5, int r6) {
        /*
        r3 = this;
        r4 = -1;
        r0 = 2;
        r1 = 1;
        r2 = 0;
        if (r6 == r4) goto L_0x0091;
    L_0x0006:
        if (r6 == 0) goto L_0x0057;
    L_0x0008:
        if (r6 == r1) goto L_0x003c;
    L_0x000a:
        if (r6 != r0) goto L_0x0023;
    L_0x000c:
        r5 = (defpackage.ahkr) r5;
        r4 = r3.h;
        if (r4 == 0) goto L_0x001a;
    L_0x0012:
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x001a;
    L_0x0018:
        goto L_0x00a1;
    L_0x001a:
        r3.h = r5;
        r3.a();
        r3.b();
        return r2;
    L_0x0023:
        r4 = new java.lang.IllegalStateException;
        r5 = new java.lang.StringBuilder;
        r0 = 32;
        r5.<init>(r0);
        r0 = "unsupported op code: ";
        r5.append(r0);
        r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x003c:
        r5 = (defpackage.ahkn) r5;
        r4 = r3.g;
        if (r4 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x004c;
    L_0x0043:
        r6 = r5.a;
        r4 = r4.equals(r6);
        if (r4 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x00a1;
    L_0x004c:
        r4 = r5.a;
        r3.g = r4;
        r3.a();
        r3.b();
        return r2;
    L_0x0057:
        r5 = (defpackage.ahkf) r5;
        r4 = r5.c;
        if (r4 == 0) goto L_0x0079;
    L_0x005d:
        r4 = r4.a;
        if (r4 == 0) goto L_0x0079;
    L_0x0061:
        r4 = r4.e;
        if (r4 == 0) goto L_0x0079;
    L_0x0065:
        r4 = r4.b;
        if (r4 == 0) goto L_0x0079;
    L_0x0069:
        r4 = r4.b;
        if (r4 == 0) goto L_0x0079;
    L_0x006d:
        r5 = r4.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x0079;
    L_0x0072:
        r4 = r4.b;
        if (r4 != 0) goto L_0x007a;
    L_0x0076:
        r4 = defpackage.awfu.e;
        goto L_0x007a;
    L_0x0079:
        r4 = r2;
    L_0x007a:
        r5 = r3.a;
        r5 = defpackage.amqq.a(r4, r5);
        if (r5 == 0) goto L_0x0083;
    L_0x0082:
        goto L_0x00a1;
    L_0x0083:
        r3.a = r4;
        r4 = r3.c;
        r4.a();
        r3.a();
        r3.b();
        return r2;
    L_0x0091:
        r4 = 3;
        r2 = new java.lang.Class[r4];
        r4 = 0;
        r5 = defpackage.ahkf.class;
        r2[r4] = r5;
        r4 = defpackage.ahkn.class;
        r2[r1] = r4;
        r4 = defpackage.ahkr.class;
        r2[r0] = r4;
    L_0x00a1:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nit.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
