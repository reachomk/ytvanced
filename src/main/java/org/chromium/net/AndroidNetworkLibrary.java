package org.chromium.net;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import defpackage.bchn;
import defpackage.bcif;
import defpackage.bcih;
import defpackage.bcis;
import defpackage.bcit;
import defpackage.bciv;
import defpackage.bckt;
import java.io.FileDescriptor;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.chromium.base.metrics.RecordHistogram;

public class AndroidNetworkLibrary {
    private static Boolean a;
    private static final Set b = new HashSet();
    private static final Set c = new HashSet();

    AndroidNetworkLibrary() {
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("foo.");
        stringBuilder.append(str);
        return URLConnection.guessContentTypeFromName(stringBuilder.toString());
    }

    public static boolean haveOnlyLoopbackAddresses() {
        boolean z = false;
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                    try {
                        if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                            return false;
                        }
                    } catch (SocketException unused) {
                    }
                }
                z = true;
            }
            return z;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("could not get network interfaces: ");
            stringBuilder.append(e);
            Log.w("AndroidNetworkLibrary", stringBuilder.toString());
            return false;
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.a(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.a();
        X509Certificate a = X509Util.a(bArr);
        synchronized (X509Util.d) {
            KeyStore keyStore = X509Util.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("root_cert_");
            stringBuilder.append(Integer.toString(X509Util.b.size()));
            keyStore.setCertificateEntry(stringBuilder.toString(), a);
            X509Util.c();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public static void clearTestRootCertificates() {
        /*
        org.chromium.net.X509Util.a();
        r0 = org.chromium.net.X509Util.d;
        monitor-enter(r0);
        r1 = org.chromium.net.X509Util.b;	 Catch:{ IOException -> 0x0012 }
        r2 = 0;
        r1.load(r2);	 Catch:{ IOException -> 0x0012 }
        org.chromium.net.X509Util.c();	 Catch:{ IOException -> 0x0012 }
        goto L_0x0012;
    L_0x0010:
        r1 = move-exception;
        goto L_0x0014;
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x0010 }
        return;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0010 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.AndroidNetworkLibrary.clearTestRootCertificates():void");
    }

    private static String getNetworkCountryIso() {
        TelephonyManager telephonyManager = (TelephonyManager) bchn.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkCountryIso();
    }

    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) bchn.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    private static String getSimOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) bchn.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimOperator();
    }

    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) bchn.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    private static boolean getIsCaptivePortal() {
        if (VERSION.SDK_INT >= 23) {
            ConnectivityManager connectivityManager = (ConnectivityManager) bchn.a.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network b = bcif.b(connectivityManager);
                if (b != null) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(b);
                    if (networkCapabilities != null && networkCapabilities.hasCapability(17)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String getWifiSSID() {
        Intent registerReceiver = bchn.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                String ssid = wifiInfo.getSSID();
                if (!(ssid == null || ssid.equals("<unknown ssid>"))) {
                    return ssid;
                }
            }
        }
        return "";
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            boolean a;
            if (VERSION.SDK_INT < 24) {
                a = bcit.a();
            } else {
                a = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            }
            return a;
        } catch (IllegalArgumentException unused) {
            return bcit.a();
        }
    }

    static boolean a(LinkProperties linkProperties) {
        return (VERSION.SDK_INT >= 28 && linkProperties != null) ? bcih.a(linkProperties) : false;
    }

    private static byte[][] getDnsServers() {
        Class cls = byte.class;
        int i = 0;
        if (a == null) {
            a = Boolean.valueOf(bchn.a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        if (!a.booleanValue()) {
            return (byte[][]) Array.newInstance(cls, new int[]{0, 0});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) bchn.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(cls, new int[]{0, 0});
        }
        Network b = bcif.b(connectivityManager);
        if (b == null) {
            return (byte[][]) Array.newInstance(cls, new int[]{0, 0});
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(b);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(cls, new int[]{0, 0});
        }
        boolean z;
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        for (InetAddress contains : dnsServers) {
            if (b.contains(contains)) {
                z = true;
                break;
            }
        }
        z = false;
        if (a(linkProperties)) {
            boolean i2;
            String b2 = VERSION.SDK_INT >= 28 ? bcih.b(linkProperties) : null;
            if (b2 != null) {
                z = c.contains(b2.toLowerCase(Locale.US));
            }
            if (b2 != null) {
                i2 = true;
            }
            RecordHistogram.a("Net.DNS.Android.DotExplicit", i2);
            RecordHistogram.a("Net.DNS.Android.AutoDohPrivate", z);
            return (byte[][]) Array.newInstance(cls, new int[]{1, 1});
        }
        RecordHistogram.a("Net.DNS.Android.AutoDohPublic", z);
        byte[][] bArr = new byte[dnsServers.size()][];
        while (i2 < dnsServers.size()) {
            bArr[i2] = ((InetAddress) dnsServers.get(i2)).getAddress();
            i2++;
        }
        return bArr;
    }

    private static void tagSocket(int i, int i2, int i3) {
        FileDescriptor a;
        ParcelFileDescriptor parcelFileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            bckt.a(i2);
        }
        if (VERSION.SDK_INT < 23) {
            a = bcis.a(i);
            parcelFileDescriptor = null;
        } else {
            parcelFileDescriptor = ParcelFileDescriptor.adoptFd(i);
            a = parcelFileDescriptor.getFileDescriptor();
        }
        bciv bciv = new bciv(a);
        TrafficStats.tagSocket(bciv);
        bciv.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            bckt.a();
        }
    }

    static {
        try {
            b.add(InetAddress.getByName("8.8.8.8"));
            b.add(InetAddress.getByName("8.8.4.4"));
            b.add(InetAddress.getByName("2001:4860:4860::8888"));
            b.add(InetAddress.getByName("2001:4860:4860::8844"));
            b.add(InetAddress.getByName("1.1.1.1"));
            b.add(InetAddress.getByName("1.0.0.1"));
            b.add(InetAddress.getByName("2606:4700:4700::1111"));
            b.add(InetAddress.getByName("2606:4700:4700::1001"));
            b.add(InetAddress.getByName("9.9.9.9"));
            b.add(InetAddress.getByName("149.112.112.112"));
            b.add(InetAddress.getByName("2620:fe::fe"));
            b.add(InetAddress.getByName("2620:fe::9"));
            c.add("dns.google");
            c.add("1dot1dot1dot1.cloudflare-dns.com");
            c.add("cloudflare-dns.com");
            c.add("dns.quad9.net");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }
}
