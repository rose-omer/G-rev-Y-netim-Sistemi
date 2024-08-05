# Görev Yönetim Sistemi

Bu proje, Java kullanılarak geliştirilmiş bir görev yönetim sistemini temsil eder. Kullanıcıların görevleri ekleyebilmesi, silebilmesi ve listeleyebilmesi için bir web uygulaması sağlar.

## Proje Bileşenleri

### Veritabanı Bağlantısı (VeritabaniBaglanti)
MySQL veritabanına bağlanmak için kullanılan sınıftır. Veritabanı bağlantısı, `DriverManager` ve `Connection` sınıfları kullanılarak yapılır.

### Görev Veri Yönetimi (Gorevlerveri)
Görevlerin veritabanından çekilmesini, eklenmesini ve silinmesini sağlayan sınıftır. Gorevler nesneleri üzerinde CRUD işlemlerini gerçekleştirir.

### Model (Gorevler)
Görevlerin özelliklerini temsil eden bir model sınıfıdır. Görevlerin ID, adı, sorumlusunun adı, yetkilisi ve tarihi gibi bilgilerini içerir.

### Servletler

- **HelloServlet**: Basit bir "Hello World" mesajı gösterir.
- **GorevEkleServlet**: HTTP POST istekleri ile yeni görevler ekler. Form verilerini alır, bir Gorevler nesnesi oluşturur ve bu nesneyi veritabanına ekler.
- **GorevSilServlet**: Görev silme işlemlerini yönetir. Görev ID'sine göre görevleri siler ve ardından kullanıcıyı görevler listesine yönlendirir.
- **GorevlerServlet**: Görevlerin durumlarını sınıflandırır ve tarih bilgisi ile birlikte görevleri çeşitli kategorilere ayırarak `dashboard.jsp` sayfasına yönlendirir. Görevler acil, stabil, gereksiz, geçmiş ve gelecekteki görevler olarak kategorilere ayrılır.

## Kullanılan Teknolojiler

- **Java Servlets**: Dinamik web içeriği oluşturmak için kullanılır. `HttpServlet` sınıfını genişleterek HTTP isteklerini işler.
- **MySQL**: Veritabanı yönetim sistemi olarak kullanılır. Veritabanı bağlantısı için JDBC API'si kullanılmıştır.
- **JDBC**: Java Database Connectivity (JDBC), Java uygulamalarının veritabanlarıyla etkileşim kurmasını sağlar.
- **JSP (JavaServer Pages)**: Web sayfalarındaki dinamik içeriği işlemek için kullanılır. `GorevlerServlet` tarafından yönlendirilen görevler, `dashboard.jsp` sayfasında kullanıcıya sunulur.

## Özellikler

- **Görev Listesi**: Veritabanındaki görevleri listeleyebilir.
- **Görev Ekleme**: Kullanıcılar yeni görevler ekleyebilir.
- **Görev Silme**: Mevcut görevler silinebilir.
- **Görev Kategorileri**: Görevler acil, stabil, gereksiz, geçmiş ve gelecekteki görevler olarak sınıflandırılır.
- **Tarih Yönetimi**: Görevlerin tarihleri kullanılarak sınıflandırma ve listeleme yapılır.

Bu proje, web tabanlı görev yönetim sistemleri için temel bir örnek teşkil eder ve Java web uygulama geliştirme konusundaki temel bilgileri pekiştirmek için iyi bir kaynak sağlar.

## Kurulum ve Kullanım

1. **Veritabanı Bağlantısı Kurulumu**: MySQL veritabanınızı oluşturun ve gerekli tabloları yapılandırın.
2. **Proje Dosyalarını İndirin**: Bu projeyi GitHub üzerinden klonlayın veya indirin.
3. **Bağımlılıkları Yükleyin**: Projede kullanılan kütüphaneleri yükleyin.
4. **Sunucuyu Çalıştırın**: Projenizi bir Java EE uyumlu sunucuda çalıştırın (örneğin, Apache Tomcat).
5. **Uygulamayı Kullanma**: Web tarayıcınız üzerinden uygulamaya erişin ve görev yönetim sistemini kullanmaya başlayın.

## Katkıda Bulunma

Katkıda bulunmak isterseniz, lütfen bir fork oluşturun ve pull request gönderin. Her türlü katkı ve geri bildiriminiz için teşekkür ederiz.

## Lisans

Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakabilirsiniz.

