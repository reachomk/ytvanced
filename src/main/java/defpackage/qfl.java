package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.gcm.Task;
import java.util.Collections;
import java.util.Set;

/* renamed from: qfl */
public class qfl {
    public int c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final Set i = Collections.emptySet();
    public qfh j = qfh.a;
    public Bundle k;

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        int i;
        StringBuilder stringBuilder;
        pzr.b(this.d != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
        qey.a(this.e);
        qfh qfh = this.j;
        if (qfh != null) {
            int i2 = qfh.b;
            StringBuilder stringBuilder2;
            if (i2 == 1 || i2 == 0) {
                i = qfh.c;
                int i3 = qfh.d;
                if (i2 == 0 && i < 0) {
                    stringBuilder2 = new StringBuilder(52);
                    stringBuilder2.append("InitialBackoffSeconds can't be negative: ");
                    stringBuilder2.append(i);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else if (i2 == 1 && i < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else if (i3 < i) {
                    stringBuilder = new StringBuilder(77);
                    stringBuilder.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                    stringBuilder.append(i3);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            stringBuilder2 = new StringBuilder(45);
            stringBuilder2.append("Must provide a valid RetryPolicy: ");
            stringBuilder2.append(i2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        if (this.g) {
            Task.b(this.k);
        }
        if (this.i.isEmpty() || this.c != 2) {
            for (Uri uri : this.i) {
                if (uri != null) {
                    String scheme = uri.getScheme();
                    String host = uri.getHost();
                    if (TextUtils.isEmpty(host) || "null".equals(host)) {
                        throw new IllegalArgumentException("URI hostname is required");
                    }
                    try {
                        i = uri.getPort();
                        if ("tcp".equals(scheme)) {
                            if (i <= 0 || i > 65535) {
                                int port = uri.getPort();
                                stringBuilder = new StringBuilder(38);
                                stringBuilder.append("Invalid required URI port: ");
                                stringBuilder.append(port);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        } else if (!"ping".equals(scheme)) {
                            String valueOf = String.valueOf(scheme);
                            scheme = "Unsupported required URI scheme: ";
                            throw new IllegalArgumentException(valueOf.length() == 0 ? new String(scheme) : scheme.concat(valueOf));
                        } else if (i != -1) {
                            throw new IllegalArgumentException("Ping does not support port numbers");
                        }
                    } catch (NumberFormatException e) {
                        String valueOf2 = String.valueOf(e.getMessage());
                        scheme = "Invalid port number: ";
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(scheme);
                        } else {
                            valueOf2 = scheme.concat(valueOf2);
                        }
                        throw new IllegalArgumentException(valueOf2);
                    }
                }
                throw new IllegalArgumentException("Null URI");
            }
            return;
        }
        throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
    }
}
