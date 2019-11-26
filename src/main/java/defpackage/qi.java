package defpackage;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qi */
public final class qi implements qd {
    public final Builder a;
    public final qg b;
    public RemoteViews c;
    public RemoteViews d;
    public final List e = new ArrayList();
    public final Bundle f = new Bundle();
    public int g;
    public RemoteViews h;

    qi(qg qgVar) {
        ArrayList arrayList;
        int size;
        Bundle bundle;
        String str;
        qg qgVar2 = qgVar;
        this.b = qgVar2;
        if (VERSION.SDK_INT >= 26) {
            this.a = new Builder(qgVar2.a, qgVar2.x);
        } else {
            this.a = new Builder(qgVar2.a);
        }
        Notification notification = qgVar2.A;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qgVar2.d).setContentText(qgVar2.e).setContentInfo(qgVar2.h).setContentIntent(qgVar2.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(qgVar2.g).setNumber(0).setProgress(qgVar2.l, qgVar2.m, qgVar2.n);
        if (VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        int i = 20;
        if (VERSION.SDK_INT >= 16) {
            this.a.setSubText(qgVar2.k).setUsesChronometer(false).setPriority(qgVar2.i);
            arrayList = qgVar2.b;
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                qc qcVar = (qc) arrayList.get(i2);
                if (VERSION.SDK_INT >= i) {
                    Action.Builder builder = new Action.Builder(qcVar.g, qcVar.h, qcVar.i);
                    qt[] qtVarArr = qcVar.b;
                    if (qtVarArr != null) {
                        int i3;
                        RemoteInput[] remoteInputArr = new RemoteInput[qtVarArr.length];
                        for (i3 = 0; i3 < qtVarArr.length; i3++) {
                            qt qtVar = qtVarArr[i3];
                            remoteInputArr[i3] = new RemoteInput.Builder(qtVar.a).setLabel(qtVar.b).setChoices(qtVar.c).setAllowFreeFormInput(qtVar.d).addExtras(qtVar.e).build();
                        }
                        for (RemoteInput addRemoteInput : remoteInputArr) {
                            builder.addRemoteInput(addRemoteInput);
                        }
                    }
                    bundle = qcVar.a;
                    if (bundle == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = new Bundle(bundle);
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", qcVar.d);
                    if (VERSION.SDK_INT >= 24) {
                        builder.setAllowGeneratedReplies(qcVar.d);
                    }
                    bundle.putInt("android.support.action.semanticAction", 0);
                    if (VERSION.SDK_INT >= 28) {
                        builder.setSemanticAction(0);
                    }
                    bundle.putBoolean("android.support.action.showsUserInterface", qcVar.e);
                    builder.addExtras(bundle);
                    this.a.addAction(builder.build());
                } else if (VERSION.SDK_INT >= 16) {
                    this.e.add(ql.a(this.a, qcVar));
                }
                i2++;
                i = 20;
            }
            bundle = qgVar2.s;
            if (bundle != null) {
                this.f.putAll(bundle);
            }
            if (VERSION.SDK_INT < 20) {
                if (qgVar2.q) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                str = qgVar2.o;
                if (str != null) {
                    this.f.putString("android.support.groupKey", str);
                    if (qgVar2.p) {
                        this.f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f.putBoolean("android.support.useSideChannel", true);
                    }
                }
            }
            this.c = qgVar2.v;
            this.d = qgVar2.w;
        }
        if (VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(qgVar2.j);
            if (VERSION.SDK_INT < 21) {
                ArrayList arrayList2 = qgVar2.B;
                if (!(arrayList2 == null || arrayList2.isEmpty())) {
                    bundle = this.f;
                    arrayList = qgVar2.B;
                    bundle.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(qgVar2.q).setGroup(qgVar2.o).setGroupSummary(qgVar2.p).setSortKey(null);
            this.g = qgVar2.z;
        }
        if (VERSION.SDK_INT >= 21) {
            this.a.setCategory(qgVar2.r).setColor(qgVar2.t).setVisibility(qgVar2.u).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
            ArrayList arrayList3 = qgVar2.B;
            size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.a.addPerson((String) arrayList3.get(i4));
            }
            this.h = null;
            if (qgVar2.c.size() > 0) {
                str = "android.car.EXTENSIONS";
                Bundle bundle2 = qgVar.b().getBundle(str);
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                Bundle bundle3 = new Bundle();
                for (int i5 = 0; i5 < qgVar2.c.size(); i5++) {
                    bundle3.putBundle(Integer.toString(i5), ql.a((qc) qgVar2.c.get(i5)));
                }
                bundle2.putBundle("invisible_actions", bundle3);
                qgVar.b().putBundle(str, bundle2);
                this.f.putBundle(str, bundle2);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.a.setExtras(qgVar2.s).setRemoteInputHistory(null);
            RemoteViews remoteViews = qgVar2.v;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            remoteViews = qgVar2.w;
            if (remoteViews != null) {
                this.a.setCustomBigContentView(remoteViews);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(qgVar2.y).setGroupAlertBehavior(qgVar2.z);
            if (!TextUtils.isEmpty(qgVar2.x)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    public static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
