package defpackage;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import android.nfc.NfcAdapter.OnNdefPushCompleteCallback;
import android.nfc.NfcEvent;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: fou */
public final class fou implements CreateNdefMessageCallback, OnNdefPushCompleteCallback {
    public final bcaa a;
    private final Executor b;

    public fou(bcaa bcaa, Executor executor) {
        this.a = bcaa;
        this.b = executor;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        FutureTask futureTask = new FutureTask(new fot(this));
        this.b.execute(futureTask);
        try {
            if (((String) ((Pair) futureTask.get()).first) == null) {
                return null;
            }
            String str = "";
            return new NdefMessage(new NdefRecord[]{new NdefRecord((short) 3, xvt.a((String) ((Pair) futureTask.get()).first, str, -1, ((Long) ((Pair) futureTask.get()).second).longValue() / 1000, "https").toString().getBytes(), new byte[0], new byte[0])});
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public final void onNdefPushComplete(NfcEvent nfcEvent) {
        xtl.e("NFC push completed");
    }
}
