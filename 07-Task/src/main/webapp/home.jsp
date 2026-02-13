<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GlowBeauty | Home</title>

<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: #f8f0f4;
    }

    /* NAVBAR */
    .navbar {
        background: #ff5fa2;
        padding: 15px 40px;
        color: white;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .navbar h2 {
        margin: 0;
    }

    .navbar a {
        color: white;
        text-decoration: none;
        margin-left: 20px;
        font-weight: 600;
    }

    /* HERO SECTION */
    .hero {
        padding: 50px;
        text-align: center;
        background: linear-gradient(135deg, #ff8ccf, #ffc1e3);
        color: #333;
    }

    .hero h1 {
        font-size: 36px;
        margin-bottom: 10px;
    }

    .hero p {
        font-size: 18px;
    }

    /* PRODUCTS */
    .products {
        padding: 40px;
    }

    .products h2 {
        text-align: center;
        margin-bottom: 30px;
        color: #333;
    }

    .product-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
        gap: 25px;
    }

    .card {
        background: #fff;
        border-radius: 10px;
        padding: 15px;
        text-align: center;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    }

    .card img {
        width: 100%;
        height: 180px;
        object-fit: cover;
        border-radius: 8px;
    }

    .card h3 {
        margin: 10px 0 5px;
        color: #333;
    }

    .card p {
        font-size: 14px;
        color: #666;
    }

    .card button {
        margin-top: 10px;
        padding: 8px 15px;
        background: #ff5fa2;
        border: none;
        border-radius: 5px;
        color: white;
        cursor: pointer;
    }

    .card button:hover {
        background: #e94a8f;
    }

    /* FOOTER */
    .footer {
        background: #333;
        color: white;
        text-align: center;
        padding: 15px;
        margin-top: 40px;
    }
</style>

</head>
<body>

<!-- NAVBAR -->
<div class="navbar">
    <h2>GlowBeauty</h2>
    <div>
        <a href="home.jsp">Home</a>
        <a href="#">Products</a>
        <a href="#">Cart</a>
        <a href="login.jsp">Logout</a>
    </div>
</div>

<!-- HERO -->
<div class="hero">
    <h1>Enhance Your Natural Glow</h1>
    <p>Premium beauty products curated just for you</p>
</div>

<!-- PRODUCTS -->
<div class="products">
    <h2>Our Best Sellers</h2>

    <div class="product-grid">

        <div class="card">
            <img src="images/moisturizer.jpg" alt="Moisturizer">
            <h3>Hydrating Moisturizer</h3>
            <p>Deep hydration for soft & glowing skin</p>
            <button>Add to Cart</button>
        </div>

        <div class="card">
            <img src="images/serum.jpg" alt="Serum">
            <h3>Vitamin C Serum</h3>
            <p>Brightens skin & reduces dark spots</p>
            <button>Add to Cart</button>
        </div>

        <div class="card">
            <img src="images/lipstick.jpg" alt="Lipstick">
            <h3>Matte Lipstick</h3>
            <p>Long-lasting color with smooth finish</p>
            <button>Add to Cart</button>
        </div>

        <div class="card">
            <img src="images/sunscreen.jpg" alt="Sunscreen">
            <h3>SPF 50 Sunscreen</h3>
            <p>Protects skin from harmful UV rays</p>
            <button>Add to Cart</button>
        </div>

    </div>
</div>

<!-- FOOTER -->
<div class="footer">
    © 2026 GlowBeauty | All Rights Reserved
</div>

</body>
</html>
    