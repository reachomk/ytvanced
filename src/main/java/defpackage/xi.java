package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;

/* renamed from: xi */
final class xi extends Handler {
    private final /* synthetic */ xe a;

    public xi(xe xeVar, Looper looper) {
        this.a = xeVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        wv wvVar = this.a.h;
        if (wvVar != null) {
            Bundle data = message.getData();
            wq.a(data);
            this.a.a(new vk(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
            wq.a(data.getBundle("data_extras"));
            try {
                Object obj;
                int keyCode;
                switch (message.what) {
                    case 1:
                        obj = message.obj;
                        break;
                    case 2:
                        this.a.a(message.arg1, 0);
                        break;
                    case 3:
                        wvVar.b();
                        break;
                    case 4:
                        obj = message.obj;
                        wvVar.c();
                        break;
                    case 5:
                        obj = message.obj;
                        wvVar.d();
                        break;
                    case 6:
                        obj = message.obj;
                        wvVar.e();
                        break;
                    case 7:
                        wvVar.f();
                        break;
                    case 8:
                        obj = message.obj;
                        wvVar.g();
                        break;
                    case 9:
                        obj = message.obj;
                        wvVar.h();
                        break;
                    case 10:
                        wvVar.a((Uri) message.obj);
                        break;
                    case 11:
                        ((Long) message.obj).longValue();
                        break;
                    case 12:
                        wvVar.i();
                        break;
                    case 13:
                        wvVar.n();
                        break;
                    case 14:
                        wvVar.j();
                        break;
                    case 15:
                        wvVar.k();
                        break;
                    case 16:
                        wvVar.l();
                        break;
                    case 17:
                        wvVar.m();
                        break;
                    case 18:
                        wvVar.a(((Long) message.obj).longValue());
                        break;
                    case 19:
                        wvVar.a((vo) message.obj);
                        break;
                    case 20:
                        obj = message.obj;
                        break;
                    case 21:
                        KeyEvent keyEvent = (KeyEvent) message.obj;
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                        if (!(wvVar.a(intent) || keyEvent == null || keyEvent.getAction() != 0)) {
                            xs xsVar = this.a.k;
                            long j = xsVar != null ? xsVar.e : 0;
                            keyCode = keyEvent.getKeyCode();
                            if (keyCode != 79) {
                                if (keyCode == 126) {
                                    if ((j & 4) != 0) {
                                        wvVar.f();
                                        break;
                                    }
                                } else if (keyCode == 127) {
                                    if ((j & 2) != 0) {
                                        wvVar.i();
                                        break;
                                    }
                                } else {
                                    switch (keyCode) {
                                        case 85:
                                            break;
                                        case 86:
                                            if ((j & 1) != 0) {
                                                wvVar.n();
                                                break;
                                            }
                                            break;
                                        case 87:
                                            if ((j & 32) != 0) {
                                                wvVar.j();
                                                break;
                                            }
                                            break;
                                        case 88:
                                            if ((j & 16) != 0) {
                                                wvVar.k();
                                                break;
                                            }
                                            break;
                                        case 89:
                                            if ((j & 8) != 0) {
                                                wvVar.m();
                                                break;
                                            }
                                            break;
                                        case 90:
                                            if ((j & 64) != 0) {
                                                wvVar.l();
                                                break;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                            break;
                        }
                        break;
                    case 22:
                        this.a.b(message.arg1, 0);
                        break;
                    case 23:
                        keyCode = message.arg1;
                        break;
                    case 25:
                        obj = message.obj;
                        break;
                    case 26:
                        Object obj2 = message.obj;
                        keyCode = message.arg1;
                        break;
                    case 27:
                        obj = message.obj;
                        break;
                    case 29:
                        ((Boolean) message.obj).booleanValue();
                        break;
                    case 30:
                        keyCode = message.arg1;
                        break;
                    case 31:
                        obj = message.obj;
                        break;
                    case 32:
                        ((Float) message.obj).floatValue();
                        break;
                    default:
                        break;
                }
                this.a.a(null);
            } catch (Throwable th) {
                this.a.a(null);
            }
        }
    }
}
