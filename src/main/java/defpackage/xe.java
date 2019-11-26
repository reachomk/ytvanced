package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: xe */
class xe implements ww {
    public final String a;
    public final String b;
    public final AudioManager c;
    public final RemoteControlClient d;
    public final Object e = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();
    public boolean g = false;
    public volatile wv h;
    public int i = 3;
    public vj j;
    public xs k;
    public PendingIntent l;
    public int m;
    public int n;
    public int o;
    public vq p;
    private final Context q;
    private final ComponentName r;
    private final PendingIntent s;
    private final xj t;
    private final xo u;
    private xi v;
    private boolean w = false;
    private vk x;
    private final vs y = new xh(this);

    public xe(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.q = context;
        this.a = context.getPackageName();
        this.c = (AudioManager) context.getSystemService("audio");
        this.b = str;
        this.r = componentName;
        this.s = pendingIntent;
        this.t = new xj(this);
        this.u = new xo(this.t);
        this.m = 0;
        this.n = 1;
        this.o = 3;
        this.d = new RemoteControlClient(pendingIntent);
    }

    static int c(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
            case 8:
                return 8;
            case 7:
                return 9;
            case 9:
                return 7;
            case 10:
            case 11:
                return 6;
            default:
                return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int a(long j) {
        int i = (1 & j) != 0 ? 32 : 0;
        if ((2 & j) != 0) {
            i |= 16;
        }
        if ((4 & j) != 0) {
            i |= 4;
        }
        if ((8 & j) != 0) {
            i |= 2;
        }
        if ((16 & j) != 0) {
            i |= 1;
        }
        if ((32 & j) != 0) {
            i |= 128;
        }
        if ((64 & j) != 0) {
            i |= 64;
        }
        return (j & 512) != 0 ? i | 8 : i;
    }

    public final void b(PendingIntent pendingIntent) {
    }

    public final Object g() {
        return null;
    }

    public final String h() {
        return null;
    }

    public void a(wv wvVar, Handler handler) {
        this.h = wvVar;
        if (wvVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            synchronized (this.e) {
                xi xiVar = this.v;
                if (xiVar != null) {
                    xiVar.removeCallbacksAndMessages(null);
                }
                this.v = new xi(this, handler.getLooper());
                this.h.a(this, handler);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2, int i3, Object obj, Bundle bundle) {
        synchronized (this.e) {
            xi xiVar = this.v;
            if (xiVar != null) {
                Message obtainMessage = xiVar.obtainMessage(i, i2, i3, obj);
                Bundle bundle2 = new Bundle();
                i3 = Binder.getCallingUid();
                bundle2.putInt("data_calling_uid", i3);
                bundle2.putString("data_calling_pkg", b(i3));
                i3 = Binder.getCallingPid();
                if (i3 <= 0) {
                    bundle2.putInt("data_calling_pid", -1);
                } else {
                    bundle2.putInt("data_calling_pid", i3);
                }
                if (bundle != null) {
                    bundle2.putBundle("data_extras", bundle);
                }
                obtainMessage.setData(bundle2);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final String b(int i) {
        String nameForUid = this.q.getPackageManager().getNameForUid(i);
        return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
    }

    public final void a() {
        synchronized (this.e) {
            this.i = 3;
        }
    }

    public final void a(int i) {
        vq vqVar = this.p;
        if (vqVar != null) {
            vqVar.d = null;
        }
        this.o = i;
        this.n = 1;
        a(new xq(1, i, 2, this.c.getStreamMaxVolume(i), this.c.getStreamVolume(this.o)));
    }

    public final void a(vq vqVar) {
        vq vqVar2 = this.p;
        if (vqVar2 != null) {
            vqVar2.d = null;
        }
        this.n = 2;
        this.p = vqVar;
        int i = this.o;
        vq vqVar3 = this.p;
        a(new xq(2, i, vqVar3.a, vqVar3.b, vqVar3.c));
        vqVar.d = this.y;
    }

    public final void a(boolean z) {
        if (z != this.w) {
            this.w = z;
            j();
        }
    }

    public final boolean b() {
        return this.w;
    }

    public final void c() {
        this.w = false;
        this.g = true;
        j();
        int beginBroadcast = this.f.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast >= 0) {
                try {
                    ((vx) this.f.getBroadcastItem(beginBroadcast)).a();
                } catch (RemoteException unused) {
                }
            } else {
                this.f.finishBroadcast();
                this.f.kill();
                return;
            }
        }
    }

    public final xo d() {
        return this.u;
    }

    public final void a(xs xsVar) {
        synchronized (this.e) {
            this.k = xsVar;
        }
        int beginBroadcast = this.f.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                break;
            }
            try {
                ((vx) this.f.getBroadcastItem(beginBroadcast)).a(xsVar);
            } catch (RemoteException unused) {
            }
        }
        this.f.finishBroadcast();
        if (this.w) {
            if (xsVar == null) {
                this.d.setPlaybackState(0);
                this.d.setTransportControlFlags(0);
                return;
            }
            b(xsVar);
            this.d.setTransportControlFlags(a(xsVar.e));
        }
    }

    public final xs e() {
        xs xsVar;
        synchronized (this.e) {
            xsVar = this.k;
        }
        return xsVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(xs xsVar) {
        this.d.setPlaybackState(xe.c(xsVar.a));
    }

    public final void a(vj vjVar) {
        if (vjVar != null) {
            vjVar = new vl(vjVar, wq.d).a();
        }
        synchronized (this.e) {
            this.j = vjVar;
        }
        int beginBroadcast = this.f.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                break;
            }
            try {
                ((vx) this.f.getBroadcastItem(beginBroadcast)).a(vjVar);
            } catch (RemoteException unused) {
            }
        }
        this.f.finishBroadcast();
        if (this.w) {
            a(vjVar != null ? new Bundle(vjVar.b) : null).apply();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public MetadataEditor a(Bundle bundle) {
        MetadataEditor editMetadata = this.d.editMetadata(true);
        if (bundle != null) {
            String str = "android.media.metadata.ART";
            Bitmap bitmap;
            if (bundle.containsKey(str)) {
                bitmap = (Bitmap) bundle.getParcelable(str);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else {
                str = "android.media.metadata.ALBUM_ART";
                if (bundle.containsKey(str)) {
                    bitmap = (Bitmap) bundle.getParcelable(str);
                    if (bitmap != null) {
                        bitmap = bitmap.copy(bitmap.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap);
                }
            }
            str = "android.media.metadata.ALBUM";
            if (bundle.containsKey(str)) {
                editMetadata.putString(1, bundle.getString(str));
            }
            String str2 = "android.media.metadata.ALBUM_ARTIST";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(13, bundle.getString(str2));
            }
            str2 = "android.media.metadata.ARTIST";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(2, bundle.getString(str2));
            }
            str2 = "android.media.metadata.AUTHOR";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(3, bundle.getString(str2));
            }
            str2 = "android.media.metadata.COMPILATION";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(15, bundle.getString(str2));
            }
            str2 = "android.media.metadata.COMPOSER";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(4, bundle.getString(str2));
            }
            str2 = "android.media.metadata.DATE";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(5, bundle.getString(str2));
            }
            str2 = "android.media.metadata.DISC_NUMBER";
            if (bundle.containsKey(str2)) {
                editMetadata.putLong(14, bundle.getLong(str2));
            }
            str2 = "android.media.metadata.DURATION";
            if (bundle.containsKey(str2)) {
                editMetadata.putLong(9, bundle.getLong(str2));
            }
            str2 = "android.media.metadata.GENRE";
            if (bundle.containsKey(str2)) {
                editMetadata.putString(6, bundle.getString(str2));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
        }
        return editMetadata;
    }

    public final void a(PendingIntent pendingIntent) {
        synchronized (this.e) {
            this.l = pendingIntent;
        }
    }

    public final void f() {
        this.m = 2;
    }

    public final vk i() {
        vk vkVar;
        synchronized (this.e) {
            vkVar = this.x;
        }
        return vkVar;
    }

    public final void a(vk vkVar) {
        synchronized (this.e) {
            this.x = vkVar;
        }
    }

    private final void j() {
        if (this.w) {
            a(this.s, this.r);
            this.c.registerRemoteControlClient(this.d);
            a(this.j);
            a(this.k);
            return;
        }
        b(this.s, this.r);
        this.d.setPlaybackState(0);
        this.c.unregisterRemoteControlClient(this.d);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(PendingIntent pendingIntent, ComponentName componentName) {
        this.c.registerMediaButtonEventReceiver(componentName);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(PendingIntent pendingIntent, ComponentName componentName) {
        this.c.unregisterMediaButtonEventReceiver(componentName);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        if (this.n == 2) {
            vq vqVar = this.p;
            if (vqVar != null) {
                vqVar.b(i);
            }
            return;
        }
        this.c.adjustStreamVolume(this.o, i, i2);
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, int i2) {
        if (this.n == 2) {
            vq vqVar = this.p;
            if (vqVar != null) {
                vqVar.a(i);
            }
            return;
        }
        this.c.setStreamVolume(this.o, i, i2);
    }

    /* Access modifiers changed, original: final */
    public final void a(xq xqVar) {
        int beginBroadcast = this.f.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast >= 0) {
                try {
                    ((vx) this.f.getBroadcastItem(beginBroadcast)).a(xqVar);
                } catch (RemoteException unused) {
                }
            } else {
                this.f.finishBroadcast();
                return;
            }
        }
    }
}
