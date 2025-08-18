<template>
  <div class="app-container home">
    <div style="background: rgb(53,60,66);height: 50px;">
      <vue-typed-js
        class="desc"
        :strings="words"
        :loop="true"
        :startDelay="300"
        :typeSpeed="100"
        :backSpeed="50"
      >
        <!-- 添加 v-typed 指令 -->
        <h1 v-typed class="typing" style="margin: auto;font-weight: bold;color: #1cf3b9;margin-top: 10px"></h1>
      </vue-typed-js>
    </div>
    <!-- 日历部分保持不变 -->
    <el-calendar id="home">
      <template
        slot="dateCell"
        slot-scope="{date, data}">
        <p :class="data.isSelected ? 'is-selected' : ''">
          {{ data.day.split('-').slice(1).join('-') }} {{ data.isSelected ? '✔️' : ''}}
        </p>
      </template>
    </el-calendar>
  </div>
</template>

<script>
// 在当前组件中局部注册（如果未全局注册）
import VueTypedJs from 'vue-typed-js'

export default {
  components: {
    VueTypedJs  // 确保组件已注册
  },
  data() {
    return {
      words: ["书山有路勤为径，学海无涯苦作舟~"]
    };
  }
};
</script>

<style scoped lang="scss">
.is-selected {
  color: #1989FA;
}
#home{
  text-align: center;
  background-image: url("../assets/images/background.jpg");
  background-size: cover;
}
</style>
