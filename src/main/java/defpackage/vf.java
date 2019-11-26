package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: vf */
final class vf extends Handler {
    private final ut a = new ut(this.b);
    private final /* synthetic */ tv b;

    vf(tv tvVar) {
        this.b = tvVar;
    }

    public final void handleMessage(Message message) {
        Message message2 = message;
        Bundle data = message.getData();
        String str = "data_callback_token";
        String str2 = "data_calling_uid";
        String str3 = "data_calling_pid";
        String str4 = "data_package_name";
        String str5 = "data_root_hints";
        String str6 = "data_result_receiver";
        String str7 = "data_media_item_id";
        ut utVar;
        StringBuilder stringBuilder;
        ut utVar2;
        ut utVar3;
        yf yfVar;
        vc vcVar;
        switch (message2.what) {
            case 1:
                wq.a(data.getBundle(str5));
                utVar = this.a;
                String string = data.getString(str4);
                int i = data.getInt(str3);
                int i2 = data.getInt(str2);
                vc vcVar2 = new vc(message2.replyTo);
                tv tvVar = utVar.a;
                if (string != null) {
                    for (String str8 : tvVar.getPackageManager().getPackagesForUid(i2)) {
                        if (str8.equals(string)) {
                            utVar.a.f.a(new us(utVar, vcVar2, string, i, i2));
                            return;
                        }
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Package/uid mismatch: uid=");
                stringBuilder.append(i2);
                stringBuilder.append(" package=");
                stringBuilder.append(string);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 2:
                utVar2 = this.a;
                utVar2.a.f.a(new uv(utVar2, new vc(message2.replyTo)));
                return;
            case 3:
                Bundle bundle = data.getBundle("data_options");
                wq.a(bundle);
                ut utVar4 = this.a;
                utVar4.a.f.a(new uu(utVar4, new vc(message2.replyTo), data.getString(str7), data.getBinder(str8), bundle));
                return;
            case 4:
                utVar3 = this.a;
                utVar3.a.f.a(new ux(utVar3, new vc(message2.replyTo), data.getString(str7), data.getBinder(str8)));
                return;
            case 5:
                utVar3 = this.a;
                str8 = data.getString(str7);
                yfVar = (yf) data.getParcelable(str6);
                vcVar = new vc(message2.replyTo);
                if (!(TextUtils.isEmpty(str8) || yfVar == null)) {
                    utVar3.a.f.a(new uw(utVar3, vcVar, str8, yfVar));
                    return;
                }
            case 6:
                wq.a(data.getBundle(str5));
                utVar = this.a;
                utVar.a.f.a(new uz(utVar, new vc(message2.replyTo), data.getInt(str2), data.getString(str4), data.getInt(str3)));
                return;
            case 7:
                utVar2 = this.a;
                utVar2.a.f.a(new uy(utVar2, new vc(message2.replyTo)));
                return;
            case 8:
                wq.a(data.getBundle("data_search_extras"));
                utVar3 = this.a;
                str8 = data.getString("data_search_query");
                yfVar = (yf) data.getParcelable(str6);
                vcVar = new vc(message2.replyTo);
                if (!(TextUtils.isEmpty(str8) || yfVar == null)) {
                    utVar3.a.f.a(new vb(utVar3, vcVar, str8, yfVar));
                    return;
                }
            case 9:
                Bundle bundle2 = data.getBundle("data_custom_action_extras");
                wq.a(bundle2);
                ut utVar5 = this.a;
                String string2 = data.getString("data_custom_action");
                yf yfVar2 = (yf) data.getParcelable(str6);
                vc vcVar3 = new vc(message2.replyTo);
                if (!(TextUtils.isEmpty(string2) || yfVar2 == null)) {
                    utVar5.a.f.a(new va(utVar5, vcVar3, string2, bundle2, yfVar2));
                    return;
                }
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unhandled message: ");
                stringBuilder.append(message2);
                stringBuilder.append("\n  Service version: 2\n  Client version: ");
                stringBuilder.append(message2.arg1);
                Log.w("MBServiceCompat", stringBuilder.toString());
                break;
        }
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(tq.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        String str = "data_calling_pid";
        if (callingPid > 0) {
            data.putInt(str, callingPid);
        } else if (!data.containsKey(str)) {
            data.putInt(str, -1);
        }
        return super.sendMessageAtTime(message, j);
    }

    public final void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}
