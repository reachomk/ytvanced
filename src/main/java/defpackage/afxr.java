package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Date;

/* renamed from: afxr */
final class afxr implements Runnable {
    private final /* synthetic */ afxs a;

    afxr(afxs afxs) {
        this.a = afxs;
    }

    public final void run() {
        String str = "Could not register for notifications with InnerTube: ";
        afxs afxs = this.a;
        boolean a = afxs.a();
        String d = afxs.d();
        int i = 0;
        if (!TextUtils.isEmpty(d)) {
            xsw a2 = afxs.d.a();
            abev abev = afxs.c;
            abew abew = new abew(abev.c, abev.d.c());
            avlh avlh = abew.a;
            anvu a3 = anvu.a(d);
            avlh.copyOnWrite();
            avli avli = (avli) avlh.instance;
            avli.a |= 1;
            avli.b = a3;
            d = afxs.a;
            avlh = abew.a;
            avlh.copyOnWrite();
            avli = (avli) avlh.instance;
            if (d != null) {
                avlh avlh2;
                avli avli2;
                avli.a |= 8;
                avli.e = d;
                if (!afxs.e.a()) {
                    avlh2 = abew.a;
                    avlh2.copyOnWrite();
                    avli2 = (avli) avlh2.instance;
                    avli2.a |= 2;
                    avli2.c = true;
                }
                if (!Boolean.valueOf(afxw.a(afxs.f)).booleanValue()) {
                    avlh2 = abew.a;
                    avlh2.copyOnWrite();
                    avli2 = (avli) avlh2.instance;
                    avli2.a |= 4;
                    avli2.d = true;
                }
                if (VERSION.SDK_INT >= 26) {
                    for (NotificationChannel notificationChannel : ((NotificationManager) afxs.f.getSystemService("notification")).getNotificationChannels()) {
                        avlj avlj = (avlj) avlk.i.createBuilder();
                        String id = notificationChannel.getId();
                        avlj.copyOnWrite();
                        avlk avlk = (avlk) avlj.instance;
                        if (id != null) {
                            avlk.a |= 1;
                            avlk.b = id;
                            int importance = notificationChannel.getImportance();
                            avlj.copyOnWrite();
                            avlk = (avlk) avlj.instance;
                            avlk.a |= 2;
                            avlk.c = importance;
                            boolean z = notificationChannel.getSound() != null;
                            avlj.copyOnWrite();
                            avlk = (avlk) avlj.instance;
                            avlk.a |= 4;
                            avlk.d = z;
                            z = notificationChannel.canShowBadge();
                            avlj.copyOnWrite();
                            avlk = (avlk) avlj.instance;
                            avlk.a |= 8;
                            avlk.e = z;
                            z = notificationChannel.shouldShowLights();
                            avlj.copyOnWrite();
                            avlk = (avlk) avlj.instance;
                            avlk.a |= 16;
                            avlk.f = z;
                            z = notificationChannel.canBypassDnd();
                            avlj.copyOnWrite();
                            avlk = (avlk) avlj.instance;
                            avlk.a |= 32;
                            avlk.g = z;
                            int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
                            avlj.copyOnWrite();
                            avlk avlk2 = (avlk) avlj.instance;
                            avlk2.a |= 64;
                            avlk2.h = lockscreenVisibility;
                            abew.b.add((avlk) ((anxl) avlj.build()));
                        } else {
                            throw new NullPointerException();
                        }
                    }
                }
                while (true) {
                    try {
                        afxs.c.a.b(abew);
                        i = 1;
                        break;
                    } catch (aanq e) {
                        xtl.b(str, e);
                        if (!a2.a()) {
                            break;
                        }
                    } catch (IllegalStateException e2) {
                        xtl.b(str, e2);
                        if (!a2.a()) {
                            break;
                        }
                    }
                }
            } else {
                throw new NullPointerException();
            }
        }
        if ((a & i) != 0) {
            afxs.b.edit().putLong("com.google.android.libraries.youtube.notification.pref.last_notification_registration_time", new Date().getTime()).apply();
        }
    }
}
