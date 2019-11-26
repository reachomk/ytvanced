package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParamsList;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.bahi;
import defpackage.bahj;
import defpackage.bahk;
import defpackage.bahl;
import defpackage.bahp;
import defpackage.bahv;
import defpackage.bahw;
import defpackage.bahx;
import defpackage.bahy;
import defpackage.bahz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DaydreamApi implements AutoCloseable {
    public static volatile Boolean bootsToVr;
    public boolean closed;
    public final ServiceConnection connection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            bahz bahy;
            String str = "DaydreamApi";
            DaydreamApi daydreamApi = DaydreamApi.this;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                bahy = queryLocalInterface instanceof bahz ? (bahz) queryLocalInterface : new bahy(iBinder);
            } else {
                bahy = null;
            }
            daydreamApi.vrCoreSdkService = bahy;
            try {
                DaydreamApi daydreamApi2 = DaydreamApi.this;
                daydreamApi2.daydreamManager = daydreamApi2.vrCoreSdkService.c();
            } catch (RemoteException unused) {
                Log.e(str, "RemoteException in onServiceConnected");
            }
            if (DaydreamApi.this.daydreamManager == null) {
                Log.w(str, "Daydream service component unavailable.");
            }
            ArrayList access$200 = DaydreamApi.this.queuedRunnables;
            int size = access$200.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) access$200.get(i)).run();
            }
            DaydreamApi.this.queuedRunnables.clear();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            DaydreamApi.this.vrCoreSdkService = null;
        }
    };
    public final Context context;
    public bahv daydreamManager;
    public final AtomicInteger lastUsedRequestCode = new AtomicInteger();
    public ArrayList queuedRunnables = new ArrayList();
    public int vrCoreApiVersion;
    public bahz vrCoreSdkService;

    /* renamed from: com.google.vr.ndk.base.DaydreamApi$8 */
    class AnonymousClass8 implements Runnable {
        public final /* synthetic */ String val$exitPromptText = null;
        public final /* synthetic */ Runnable val$onFailureRunnable;
        public final /* synthetic */ PendingIntent val$pendingVrExitIntent;

        AnonymousClass8(Runnable runnable, PendingIntent pendingIntent, String str) {
            this.val$onFailureRunnable = runnable;
            this.val$pendingVrExitIntent = pendingIntent;
        }

        public void run() {
            String str = "DaydreamApi";
            if (DaydreamApi.this.daydreamManager == null) {
                Log.w(str, "Failed to exit VR: Daydream service unavailable.");
                this.val$onFailureRunnable.run();
                return;
            }
            try {
                String str2 = "Failed to exit VR: Invalid request.";
                if (DaydreamApi.this.vrCoreApiVersion >= 23) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("EXIT_VR_INTENT_KEY", this.val$pendingVrExitIntent);
                    bundle.putString("EXIT_VR_TEXT_KEY", this.val$exitPromptText);
                    if (!DaydreamApi.this.daydreamManager.a(bundle)) {
                        Log.w(str, str2);
                        this.val$onFailureRunnable.run();
                    }
                } else if (!DaydreamApi.this.daydreamManager.b(this.val$pendingVrExitIntent)) {
                    Log.w(str, str2);
                    this.val$onFailureRunnable.run();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
                stringBuilder.append("Failed to exit VR: RemoteException while exiting:");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
                this.val$onFailureRunnable.run();
            }
        }
    }

    public static DaydreamApi create(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        } else if (!DaydreamUtils.isDaydreamPhone(context)) {
            return null;
        } else {
            DaydreamApi daydreamApi = new DaydreamApi(context);
            if (daydreamApi.init()) {
                return daydreamApi;
            }
            Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
            return null;
        }
    }

    public static boolean isDaydreamReadyPlatform(Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }

    public static CardboardDevice$DeviceParamsList getRecentHeadsets(Context context) {
        bahi a = bahk.a(context);
        CardboardDevice$DeviceParamsList b;
        try {
            b = a.b();
            return b;
        } catch (Exception e) {
            Log.e("DaydreamApi", "Error when getting recent headsets", e);
            b = new CardboardDevice$DeviceParamsList();
            b.params = new CardboardDevice$DeviceParams[0];
            return b;
        } finally {
            a.e();
        }
    }

    public void registerDaydreamIntent(final PendingIntent pendingIntent) {
        checkNotClosed();
        runWhenServiceConnected(new Runnable() {
            public void run() {
                String str = "DaydreamApi";
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.w(str, "Can't register/unregister daydream intent: no DaydreamManager.");
                    return;
                }
                try {
                    if (pendingIntent != null) {
                        DaydreamApi.this.daydreamManager.a(pendingIntent);
                    } else {
                        DaydreamApi.this.daydreamManager.b();
                    }
                } catch (RemoteException e) {
                    Log.e(str, "Error when attempting to register/unregister daydream intent: ", e);
                }
            }
        });
    }

    public void unregisterDaydreamIntent() {
        checkNotClosed();
        registerDaydreamIntent(null);
    }

    public static boolean bootsToVr(Context context) {
        if (bootsToVr == null) {
            bootsToVr = Boolean.valueOf(getBooleanSetting(context, "boots_to_vr", false));
        }
        return bootsToVr.booleanValue();
    }

    static boolean getBooleanSetting(Context context, String str, boolean z) {
        StringBuilder stringBuilder;
        String str2 = " state from ContentProvider";
        bahj b = bahk.b(context);
        String str3 = "DaydreamApi";
        if (b == null) {
            String valueOf = String.valueOf(str);
            str = "No ContentProvider available for ";
            Log.e(str3, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return false;
        }
        Cursor cursor = null;
        try {
            cursor = b.a.query(bahl.a(b.b, str), null, null, null, null);
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                b.a();
                return false;
            }
            z = true;
            if (cursor.getInt(0) != 1) {
                z = false;
            }
            cursor.close();
            b.a();
            return z;
        } catch (RemoteException e) {
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
            stringBuilder.append("Failed to read ");
            stringBuilder.append(str);
            stringBuilder.append(str2);
            Log.e(str3, stringBuilder.toString(), e);
            if (cursor != null) {
                cursor.close();
            }
            b.a();
            return false;
        } catch (SecurityException e2) {
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 60);
            stringBuilder.append("Insufficient permissions to read ");
            stringBuilder.append(str);
            stringBuilder.append(str2);
            Log.e(str3, stringBuilder.toString(), e2);
            if (cursor != null) {
                cursor.close();
            }
            b.a();
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            b.a();
        }
    }

    public void launchInVr(PendingIntent pendingIntent) {
        checkNotClosed();
        launchInVr(pendingIntent, null);
    }

    private void launchInVr(final PendingIntent pendingIntent, final ComponentName componentName) {
        runWhenServiceConnected(new Runnable() {
            public void run() {
                String str = "DaydreamApi";
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.w(str, "Can't launch PendingIntent via DaydreamManager: not available.");
                    try {
                        pendingIntent.send();
                        return;
                    } catch (Exception e) {
                        Log.e(str, "Couldn't launch PendingIntent: ", e);
                        return;
                    }
                }
                try {
                    DaydreamApi.this.daydreamManager.a(pendingIntent, componentName);
                } catch (RemoteException e2) {
                    Log.e(str, "RemoteException while launching PendingIntent in VR.", e2);
                }
            }
        });
    }

    private void launchTransitionCallbackInVr(final bahx bahx) {
        runWhenServiceConnected(new Runnable() {
            public void run() {
                String str = "DaydreamApi";
                if (DaydreamApi.this.daydreamManager != null) {
                    try {
                        if (DaydreamApi.this.daydreamManager.a(bahx)) {
                            return;
                        }
                    } catch (RemoteException e) {
                        Log.e(str, "RemoteException while launching VR transition: ", e);
                    }
                }
                Log.w(str, "Can't launch callbacks via DaydreamManager, sending manually");
                try {
                    bahx.onTransitionComplete();
                } catch (RemoteException unused) {
                }
            }
        });
    }

    public void launchVrHomescreen() {
        checkNotClosed();
        runWhenServiceConnected(new Runnable() {
            public void run() {
                String str = "DaydreamApi";
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.e(str, "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
                    return;
                }
                try {
                    if (!DaydreamApi.this.daydreamManager.c()) {
                        Log.e(str, "There is no VR homescreen installed.");
                    }
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 47);
                    stringBuilder.append("RemoteException while launching VR homescreen: ");
                    stringBuilder.append(valueOf);
                    Log.e(str, stringBuilder.toString());
                }
            }
        });
    }

    public void launchInVr(Intent intent) {
        checkNotClosed();
        if (intent != null) {
            checkIntent(intent);
            launchInVr(PendingIntent.getActivity(this.context, getUniqueRequestCode(), intent, 1207959552), intent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
    }

    public void launchInVr(ComponentName componentName) {
        checkNotClosed();
        if (componentName != null) {
            Intent createVrIntent = createVrIntent(componentName);
            checkIntent(createVrIntent);
            launchInVr(PendingIntent.getActivity(this.context, 0, createVrIntent, 1073741824), createVrIntent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
    }

    public void launchInVrForResult(final Activity activity, final PendingIntent pendingIntent, final int i) {
        checkNotClosed();
        launchTransitionCallbackInVr(new bahw(this) {
            public void onTransitionComplete() {
                activity.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
                        } catch (SendIntentException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 43);
                            stringBuilder.append("Exception while starting next VR activity: ");
                            stringBuilder.append(valueOf);
                            Log.e("DaydreamApi", stringBuilder.toString());
                        }
                    }
                });
            }
        });
    }

    public static Intent createVrIntent(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return setupVrIntent(intent);
    }

    public static Intent setupVrIntent(Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }

    public void exitFromVr(Activity activity, int i, Intent intent) {
        exitFromVr(activity, i, intent, null);
    }

    public void exitFromVr(Activity activity, int i, Intent intent, String str) {
        checkNotClosed();
        if (intent == null) {
            intent = new Intent();
        }
        final PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        runWhenServiceConnected(new AnonymousClass8(new Runnable(this) {
            public void run() {
                try {
                    createPendingResult.send(0);
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
                    stringBuilder.append("Couldn't launch PendingIntent: ");
                    stringBuilder.append(valueOf);
                    Log.e("DaydreamApi", stringBuilder.toString());
                }
            }
        }, createPendingResult, null));
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            runWhenServiceConnected(new Runnable() {
                public void run() {
                    Context applicationContext;
                    if (DaydreamApi.this.context.getApplicationContext() != null) {
                        applicationContext = DaydreamApi.this.context.getApplicationContext();
                    } else {
                        applicationContext = DaydreamApi.this.context;
                    }
                    applicationContext.unbindService(DaydreamApi.this.connection);
                    DaydreamApi.this.vrCoreSdkService = null;
                }
            });
        }
    }

    protected DaydreamApi(Context context) {
        this.context = context;
    }

    /* Access modifiers changed, original: protected */
    public boolean init() {
        String str = "DaydreamApi";
        StringBuilder stringBuilder;
        try {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(this.context);
            this.vrCoreApiVersion = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion < 8) {
                stringBuilder = new StringBuilder(69);
                stringBuilder.append("VrCore out of date, current version: ");
                stringBuilder.append(vrCoreClientApiVersion);
                stringBuilder.append(", required version: ");
                stringBuilder.append(8);
                Log.e(str, stringBuilder.toString());
                return false;
            }
            Context context;
            Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
            intent.setPackage("com.google.vr.vrcore");
            if (this.context.getApplicationContext() == null) {
                context = this.context;
            } else {
                context = this.context.getApplicationContext();
            }
            if (context.bindService(intent, this.connection, 1)) {
                return true;
            }
            Log.e(str, "Unable to bind to VrCoreSdkService");
            return false;
        } catch (bahp e) {
            String valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 22);
            stringBuilder.append("VrCore not available: ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void runWhenServiceConnected(Runnable runnable) {
        if (this.vrCoreSdkService != null) {
            runnable.run();
        } else {
            this.queuedRunnables.add(runnable);
        }
    }

    private void checkIntent(Intent intent) {
        List queryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            String valueOf = String.valueOf(intent);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 43);
            stringBuilder.append("No activity is available to handle intent: ");
            stringBuilder.append(valueOf);
            throw new ActivityNotFoundException(stringBuilder.toString());
        }
    }

    private void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getUniqueRequestCode() {
        return this.lastUsedRequestCode.incrementAndGet();
    }
}
