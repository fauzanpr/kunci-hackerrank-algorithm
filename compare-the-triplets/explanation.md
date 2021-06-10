<p>Program tersebut berfungsi untuk menghitung nilai dari a dan b dengan ketentuan</p>
<ol>
  <li>Apabila a > b maka a mendapatkan 1 poin</li>
  <li>Apabila b > a maka b mendapatkan 1 poin</li>
  <li>Apabila a = b maka keduanya tidak mendapatkan poin</li>
 <hr>
<h2>The Algorithm</h2>
<ul>
  <li>Untuk menghitung poin a atau b, digunakan variabel valA (untuk menyimpan poin dari a) dan valB (untuk menyimpan poin dari b)</li>
  <li>Pada program tersebut dibuat List bernama value yang nantinya akan dijadikan nilai pengembalian</li>
  <li>Kedua variabel tersebut diinisialisasi dengan 0</li>
  <li>Perhitungan poin dilakukan di dalam looping, saya gunakan for karena sudah diketahui bahwa akan ada (a.size()-1) atau (b.size()-1) perulangan</li>
  <li>Di dalam looping tersebut, diberikan pengkondisian sesuai dengan ketentuan di atas, yaitu 
    <ul>
      <li>Apabila a > b maka valA akan ditambah 1</li>
      <li>Apabila a < b maka valB akan ditambah 1</li>
      <li>Apabila tidak keduanya, proses akan berlanjut menuju ke iterasi berikutnya</li>
    </ul>
  </li>
  <li>Setelah keluar dari loop, akan ditambahkan nilai ke dalam list value pada indeks ke-0 dan ke-1</li>
  <li>Indeks ke-0 diberikan dengan nilai pada varA dan indeks ke-1 akan diberikan dengan nilai pada varB</li>
  <li>Selanjutnya, value digunakan sebagai nilai kembalian</li>
</ul>
