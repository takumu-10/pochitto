<script setup lang="ts">
import { inject } from 'vue'
import { useRouter } from 'vue-router'

const isLoggedIn = inject('isLoggedIn')
const router = useRouter()

// // --- 家計簿のデータ管理 ---
// const balance = ref(100000) // 初期残高 10万円
// const inputAmount = ref<number | null>(null) // 入力欄の数字

// // 支出を記録する関数
// const spendMoney = () => {
//   if (inputAmount.value && inputAmount.value > 0) {
//     balance.value -= inputAmount.value // 残高から引く
//     inputAmount.value = null // 入力欄を空にする
//     alert('記録しました！')
//   } else {
//     alert('金額を入力してください')
//   }
// }

const goToLogin = () => router.push('/login')
</script>

<template>
  <div class="home-container">
    <div v-if="!isLoggedIn" class="hero-card">
      <div class="icon-circle">💰</div>
      <h1>POCHITTO</h1>
      <p>俺たちの家計簿アプリ</p>
      <button class="primary-btn" @click="goToLogin">はじめる</button>
    </div>

    <div v-else class="dashboard">
      <header class="user-header">
        <h1>Dashboard</h1>
        <div class="avatar">👤</div>
      </header>
      <div class="summary-card">
        <span class="label">今月の残り</span>
        <span class="amount">¥45,000</span>
      </div>
    </div>
  </div>
</template>

<style scoped>
.home-container {
  font-family: 'Helvetica Neue', Arial, sans-serif;
}

.hero-card {
  background: white;
  padding: 3rem 2rem;
  border-radius: 24px;
  box-shadow: 0 10px 25px rgba(0,0,0,0.05);
  text-align: center;
  max-width: 400px;
}

.icon-circle {
  font-size: 3rem;
  margin-bottom: 1rem;
}

h1 {
  color: #2c3e50;
  font-size: 1.8rem;
  margin-bottom: 0.5rem;
}

p {
  color: #7f8c8d;
  margin-bottom: 2rem;
}

.primary-btn {
  background: #42b883;
  color: white;
  border: none;
  padding: 12px 40px;
  font-size: 1rem;
  font-weight: bold;
  border-radius: 12px;
  cursor: pointer;
  transition: transform 0.2s, background 0.2s;
}

.primary-btn:hover {
  background: #33a06f;
  transform: translateY(-2px);
}

/* ログイン後のスタイル */
.summary-card {
  background: linear-gradient(135deg, #42b883, #34495e);
  color: white;
  padding: 2rem;
  border-radius: 20px;
  display: flex;
  flex-direction: column;
}
</style>